package com.ustglobal.exception.second;

public class TestA {
	public static void main(String[] args) {
	 System.out.println("main started");
	 
	 try {
		 Thread.sleep(3000);
		 System.out.println("inside try");
	 }catch(InterruptedException ie) {
		 System.out.println("excepytion caught");
		 ie.printStackTrace();
	 }
	 System.out.println("main ended");
	}

}
