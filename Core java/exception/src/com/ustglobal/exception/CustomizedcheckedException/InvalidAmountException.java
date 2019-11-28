package com.ustglobal.exception.CustomizedcheckedException;

public class InvalidAmountException extends Exception {
	private String msg = "Daily limit is 40000";
	
	public String getMsg() {
		return msg; 
	}
	

}
