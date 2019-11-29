package com.ustglobal.jdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import com.mysql.jdbc.Driver;

public class DeleteQuery1 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
//		Driver driver = new Driver();
//		DriverManager.registerDriver(driver);
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		conn = DriverManager.getConnection(url);
		String sql = "delete from employee_info where id=?";
		pstmt = conn.prepareStatement(sql);
		String empid = args[0];
		int id = Integer.parseInt(empid);
		pstmt.setInt(1,id);   //pstmt.setInt(1,Integer.pars(args[0]);
		int count =pstmt.executeUpdate();
		System.out.println(count + "row(s) deleted");
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if(conn!= null) {
				conn.close();
			}if(pstmt!=null) {
				pstmt.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		}
		
	}

}
