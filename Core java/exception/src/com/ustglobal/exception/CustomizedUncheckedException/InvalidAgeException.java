package com.ustglobal.exception.CustomizedUncheckedException;

public class InvalidAgeException extends RuntimeException {
	
	
String message = "invalid age below 18 years not allowed";
public InvalidAgeException() {
	
}
public  InvalidAgeException(String message) {
	this.message = message;
	
}
@Override
public String getMessage() {
	return message;
}

}
