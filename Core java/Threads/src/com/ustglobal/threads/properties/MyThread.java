package com.ustglobal.threads.properties;

public class MyThread extends Thread {
	
   public static void main(String[] args) {
	   System.out.println("main started");
	   
	  
	   String tname=Thread.currentThread().getName();
	   System.out.println("current thread " +tname);
	   MyThread t1 = new MyThread();
	   String mname = t1.getName();
	   System.out.println("myThread name " +mname);
	   
	   Thread.currentThread().setName("Bala");
	   
	   t1.setName("Golu");
	   System.out.println("My Thread name " +t1.getName());
	   
	   System.out.println(10/0);
	   
	   System.out.println("main ended");
	   
	
}

}
