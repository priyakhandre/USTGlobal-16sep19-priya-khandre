package com.ustglobal.jdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class UpdateQuery {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
	    String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
	    conn =DriverManager.getConnection(url);
	    String sql = "update employee_info set name='laxmi',size=50000,gender='o' where id=7";
	    stmt =conn.createStatement();
	    int c=stmt.executeUpdate(sql);
	    System.out.println(c+ "rows updated");
	    }catch(SQLException e) {
	    	e.printStackTrace();
	    }finally {
	    	try {
	    		if(conn!=null) {
	    			conn.close();
	    		}if(stmt!=null) {
	    			stmt.close();
	    		}
	    	}catch(SQLException e) {
	    		e.printStackTrace();
	    	}
	    }
	}	

}
