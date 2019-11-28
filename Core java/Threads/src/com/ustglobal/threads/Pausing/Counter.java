package com.ustglobal.threads.Pausing;

public class Counter {
	int v;
	
	synchronized public void increment () {
		v++;
	}
	
	synchronized  public void decrement () {
		v--;
	}
	
	public void showValue() {
		System.out.println("v value is " +v);
	}
	

}
