package com.ustglobal.exception.CustomizedcheckedException;

public class testAmount {
	
	public static void main(String[] args) {
		System.out.println("main started");
		
		ValidateAmount va = new ValidateAmount ();
		try {
			va.checkAmount(50000);
			System.out.println("withdraw your cash");
		}catch (InvalidAmountException e) {
			
			System.out.println(e.getMsg());
		}
		System.out.println("main ended");
		}

}
