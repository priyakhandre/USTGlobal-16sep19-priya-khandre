package com.ustglobal.threads.Pausing;

public class TestJoin {
	public static void main(String[] args) {
		System.out.println("main started");
		
		MyJoinThread t = new MyJoinThread();
		t.start();
		try {
			t.join(10000); //can overload join() join(long ms) join (long ms,int ns)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i =0; i<5 ; i++) {
			System.out.println("main thread");
		}
		
		System.out.println("main ended");
		
	}

}
