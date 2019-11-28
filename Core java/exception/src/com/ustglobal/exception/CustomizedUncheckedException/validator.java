package com.ustglobal.exception.CustomizedUncheckedException;

public class validator {
	
	void verify (int age) {
		if(age <18) {
			throw new InvalidAgeException("try again next time");
			
			
		}
	}

}
