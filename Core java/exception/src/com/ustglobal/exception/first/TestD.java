package com.ustglobal.exception.first;

public class TestD {
	public static void main(String[] args) {
		System.out.println("main started");
		int[] a = {10,20,30};
		int b=10;
		try {
			
			System.out.println(b/0);
		}catch (ArithmeticException AE) {
			System.out.println("number divided by zero");
		}
		try {
			System.out.println(a[4]);
		}catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("array index not present");
			
		}
		System.out.println("main ended");
		
	}

}
