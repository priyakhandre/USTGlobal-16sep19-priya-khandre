package com.ustglobal.fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVReader {
	public static void main(String[] args) {
		try(FileReader in = new FileReader("csv.txt");
		BufferedReader reader = new BufferedReader(in)){
//			System.out.println(reader.readLine());
//			System.out.println(reader.readLine()); these will read one by one line
			while(reader.ready()) {
				String Line =  reader.readLine();
				System.out.println(Line);
				String[] words = Line.split(",");
				System.out.println("id " +words[0]);
				System.out.println("name " +words[1]);
				System.out.println("salary " +words[2]);
				System.out.println("gender " +words[3]);
				
				
				
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	
}
}
