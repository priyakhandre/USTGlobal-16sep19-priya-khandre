package com.ustglobal.jdbcApp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertWithCSVFile {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "insert into employee_info values(?,?,?,?)";
		try(FileReader in = new FileReader("csv.txt");
				
				BufferedReader reader = new BufferedReader(in);
				Connection conn = DriverManager.getConnection(url);
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			while(reader.ready()) {
				String Line = reader.readLine();
				String[] datas = Line.split(",");
				int id = Integer.parseInt(datas[0]);
				String name = datas[1];
				int sal = Integer.parseInt(datas[2]);
				String gender = datas[3];
				
				pstmt.setInt(1,id);
				pstmt.setString(2, name);	
				pstmt.setInt(3, sal);
				pstmt.setString(4, gender);
				
				
				pstmt.addBatch();
			
				
				
			}//end of while loop
		int [] counts = pstmt.executeBatch();
		System.out.println(counts.length + " rows inserted ");
				
		
	}catch(Exception e) {
		e.printStackTrace();
	}//end of try catch

}
}

