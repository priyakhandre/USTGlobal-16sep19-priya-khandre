package com.ustglobal.Arrays;

public class TestA {
	public static void main(String[] args) {
		int[] nums=new int[5];
		nums[0] =10;
		nums[1] =20;
		nums[2] =30;
		nums[3] =40;
		nums[4] =50;
		
		for (int i = 0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		System.out.println("=============================");
		
		for(int i :nums) {
			System.out.println(i);
		}
		
		char[] ch = {'a','b','c','d' } ;
		for (int i = 0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		for (char c1 :ch) {
			System.out.println(c1);
		}
		
		boolean[] b = {true,false,true,false,true};
		for (int i = 0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		for (boolean i : b) {
			System.out.println(b);
			
	     }
		
		byte[] b1 = {1,2,3,4};
		for (int i = 0;i<b1.length;i++) {
			System.out.println(b1[i]);
		}
		
		for (byte b2 : b1) {
			System.out.println(b1);
		}
		
		double[] d = {10.222,34.5456,123.45678};
		for (int i = 0;i<d.length;i++) {
			System.out.println(d[i]);
		}
		for (double d1: d) {
			System.out.println(d);
		}
		String[] names = {"priya","pooja","chinnu","som"};
		for (String name : names) {
			System.out.println(names);
		}
		
 	}

}
