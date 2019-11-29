package com.ustglobal.fileHandling;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MyFirstJDBCWithProperties {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt  = null;
		ResultSet rs = null;
		FileReader reader = null;
		try {
			reader = new FileReader("db.properies");
			Properties prop = new Properties();
			prop.load(reader);
			
			//step 1 : load and register  the driver
			Class.forName("com.mysql.jdbc.Driver");
			//step 2 : get the connection 
			String url = "jdbc:mysql://localhost:3306/ust_ty_db";
			conn = DriverManager.getConnection(url, "root", "root");
			//step 3 :issue SQL Query
			stmt = conn.createStatement();
			String sql = "select * from employee_info";
			rs = stmt.executeQuery(sql);
			//step 4 : Read the Result
			while(rs.next()) {
				int id = rs.getInt("id");//1 better to use column name as String name
				String name = rs.getString("name");//2
				int size= rs.getInt("size");//3
				String gender = rs.getString("gender");//4
				System.out.println("id is " +id);
				System.out.println("name is " +name);
				System.out.println("size is " +size);
				System.out.println("gender is " +gender);
				System.out.println("*********************");
			}

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//step 5 : close all jdbc object
			try {
				if(conn !=null) {
					conn.close();

				}
				if(stmt!= null) {
					conn.close();
				}
				if(rs!= null) {
					conn.close();
				}
				if(reader!=null) {
					reader.close();
				}
			}catch (Exception e) {
				e.printStackTrace();

			}
		}
		
		
	}

}
