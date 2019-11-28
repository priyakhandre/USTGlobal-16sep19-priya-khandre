package com.ustglobal.exception.first;

import javax.crypto.AEADBadTagException;

public class BMS {
	public static void main(String[] args) {
		System.out.println("bms started");
		
		PVR p = new PVR();
		try {
			p.book();
			System.out.println("booking confirmed");
		}
		catch (ArithmeticException ae) {
			System.out.println("booking failed");
		}
		System.out.println("bms ended");
	}

}
