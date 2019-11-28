package com.ustglobal.exception.first;

import javax.crypto.AEADBadTagException;

public class TestG {
	public static void main(String[] args) {
		System.out.println("main started");
		payTm p=new payTm();
		try {
		p.book();
		}catch(ArithmeticException ae) {
			System.out.println("Exception caught in main");
		}finally {
			System.out.println("executing finally");
		}
		System.out.println("main ended");
	}

}
