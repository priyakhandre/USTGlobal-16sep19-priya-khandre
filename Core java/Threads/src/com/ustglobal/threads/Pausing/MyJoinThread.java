package com.ustglobal.threads.Pausing;

public class MyJoinThread  extends Thread{
	
	@Override
	public void  run () {
		for(int i =0 ; i<5 ; i++)
		System.out.println("child thread");
		
		try {
			Thread.sleep(20000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
