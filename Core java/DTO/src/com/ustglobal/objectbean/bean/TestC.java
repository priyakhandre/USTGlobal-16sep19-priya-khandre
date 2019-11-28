package com.ustglobal.objectbean.bean;

import java.util.Scanner;

public class TestC {
	public static void main(String[] args) {
		System.out.println("scanner class");
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter age");
		int age =sc.nextInt();
		System.out.println("Age id " +age);
		
		
		Scanner sc1=new Scanner (System.in);
		System.out.println("enter a name");
		String name1=sc1.next();
		System.out.println("name is " +name1);
		

		Scanner sc2=new Scanner (System.in);
		System.out.println("enter a name");
		String name=sc2.nextLine();
		System.out.println("name is " +name);
		
		
		
		
	}

}
