package com.ustglobal.exception.first;

import javax.crypto.AEADBadTagException;

public class TestE {
	public static void main(String[] args) {
		System.out.println("main started");

		String s = "hello";
		int[] a ={10,20,30};
		int b = 10;

		try {
			String s1 = s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[2]);
			System.out.println(b/0);
		}catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("index is not present");
		}catch (NullPointerException np) {
			System.out.println("dont play with null");
		}catch(ArithmeticException Ae) {
			System.out.println("number is divided by zero");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
