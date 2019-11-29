package com.ustglobal.fileHandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
	public static void main(String[] args) {
		String path ="Text.properties";
		FileReader reader = null;
		try {
			
			 reader = new FileReader(path);
			 Properties properties = new Properties();
			 properties.load(reader);
			 String name  = properties.getProperty("name");
			 String company  = properties.getProperty("company");
			 String bf = properties.getProperty("bf");
			 
			 System.out.println("name is " +name);
			 System.out.println("company is " +company); 
			 System.out.println("bf is " +bf);
			 
			 
			 
			 
			 
			 
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


