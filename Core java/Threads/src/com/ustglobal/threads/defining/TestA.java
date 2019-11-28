package com.ustglobal.threads.defining;

public class TestA {
	public static void main(String[] args) {
		System.out.println("main started");
		
		MyThread t1=new MyThread();
		
		/*t1.call();
		 * dont call run() , it behaves like normal program
		 * All code will be executed inside main thread only 
		 */
		
		t1.start();
		/*t1.start();
		 * IllegalThreadStateException*/
		
		for(int i =0;i<10;i++) {
			System.out.println("main ended");
		}
		System.out.println("main ended");
	}

}
