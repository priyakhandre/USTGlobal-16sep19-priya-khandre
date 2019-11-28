package com.ustglobal.exception.CustomizedcheckedException;

import java.util.Scanner;

public class TestC {
static void main(String[] args) {
		Scanner sc1 = new Scanner (System.in);   //ctrl+shift+o
		try (Scanner sc = new Scanner(System.in);
				Scanner sc2 = new Scanner(System.in)){
			System.out.println("enter age");
			int age = sc.nextInt();
		    System.out.println("age is" +age);
		    System.out.println(age/0);
		    
			
		}catch (ArithmeticException ae) {
			ae.printStackTrace();
		}finally {
			System.out.println("finally executed");
		}
	}

}
