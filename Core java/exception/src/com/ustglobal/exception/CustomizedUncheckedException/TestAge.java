package com.ustglobal.exception.CustomizedUncheckedException;

public class TestAge {
	public static void main(String[] args) {
		System.out.println("main started");
		
		validator v = new validator();
		try {
		v.verify(12);
		}catch(InvalidAgeException ie) {
			
			System.out.println("Exception occured");
		}
		v.verify(13);
		System.out.println("main ended");
	}

}
