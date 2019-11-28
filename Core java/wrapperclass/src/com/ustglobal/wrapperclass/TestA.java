package com.ustglobal.wrapperclass;

public class TestA {
	public static void main(String[] args) {
		int a= 10;
		System.out.println("a is " +a);
		Integer i = a; // Boxing or auto Boxing
		System.out.println("i is " + i);
		
		
		Integer x = 10;
		System.out.println("x is" +x);
		int y = x; //unboxing or auto unboxing
		System.out.println("y is " +y);
		
		
		Integer value=Integer.parseInt("123");
		System.out.println("value is " +value) ;
		/*Integer value1=Integer.parseInt("123ghds");
		System.out.println("value is " +value1) ;*/
		Boolean result=Boolean.parseBoolean("true");
		System.out.println("result is " +result);
		
	}

}
