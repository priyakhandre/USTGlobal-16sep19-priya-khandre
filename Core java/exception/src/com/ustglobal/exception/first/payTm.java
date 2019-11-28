package com.ustglobal.exception.first;

public class payTm {
	void book() {
		System.out.println("payTm started");
		IRCTC i=new IRCTC();
	    i.confirm();
		System.out.println("payTm ended");
	}
	

}
