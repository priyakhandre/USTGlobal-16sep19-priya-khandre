package com.ustglobal.jdbcApp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;

import com.mysql.jdbc.Statement;

public class TryWithTryResources {
	
	public static void main(String[] args) {
		
		try(FileReader reader = new FileReader("db.properties")){
			Properties prop = new Properties();
			prop.load(reader);
				Class.forName(prop.getProperty("driver-Class-Name"));
				
				String url = prop.getProperty("url");
				String sql = prop.getProperty("select-query");
				
				
        try(Connection conn =DriverManager.getConnection(url,prop);
        		Statement stmt =  (Statement) conn.createStatement();
        		ResultSet rs = stmt.executeQuery(sql)) {
        			while(rs.next()) {
        				System.out.println("id is " +rs.getInt("id"));
        				System.out.println("name is " +rs.getString("name"));
        				System.out.println("size is " +rs.getInt("size"));
        				System.out.println("gender is " +rs.getString("gender"));
        				System.out.println("*********************");
        			}
        		}
	
			}catch(Exception e) {
				e.printStackTrace();
			}

}
} 

