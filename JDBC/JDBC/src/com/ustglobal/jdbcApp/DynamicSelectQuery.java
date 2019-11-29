package com.ustglobal.jdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicSelectQuery {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "Select * from employee_info where id =?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//step 1 :load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			
			//step 2 :get the connection 
			
			conn = DriverManager.getConnection(url);
			
			//step 3 :Issue SQL Query 
			pstmt=conn.prepareStatement(sql);
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			
			rs = pstmt.executeQuery();
			
			//step 4 : Read the result
			
			if(rs.next()) {
				int emp_id = rs.getInt("id");
				int size1 = rs.getInt("size");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
			    
				System.out.println("id is " +emp_id);
				System.out.println("size " +size1);
				System.out.println("name " +name);
				System.out.println("gender " +gender);
				
				
				
				
			}
			
			
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (conn!= null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(rs!= null) {
					rs.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		
		}
	}
}


