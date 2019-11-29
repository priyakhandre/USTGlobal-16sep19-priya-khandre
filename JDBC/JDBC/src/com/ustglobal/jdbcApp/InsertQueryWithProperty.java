package com.ustglobal.jdbcApp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class InsertQueryWithProperty {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			Class.forName(prop.getProperty("driver-Class-Name"));
			
			
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
			
			String sql = prop.getProperty("insert-query");
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String empsize = args[2];
			int size = Integer.parseInt(empsize);
			pstmt.setInt(3, size);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			
			
			int count = pstmt.executeUpdate();
			
			System.out.println(+ count + "rows inserted");
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//step 5:close all JDBC objects
			try {
				if(conn!=null) {
					conn.close();
					
				}if(pstmt!=null) {
					pstmt.close();
				}
				if(reader!=null) {
					reader.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	} 
	}

}
