package com.ustglobal.springrest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.springrest.dto.EmployeeResponse;

/*@ControllerAdvice  if there is an exception it wil get executed and it is for springMvc*/
@RestControllerAdvice /*it is for SpringRest @ControllerAdvice + @ResponseBody */  
public class HandleException {

	/*it can accept any type of Exception*/
	@ExceptionHandler(Exception.class)   	
	public EmployeeResponse getException() {
		EmployeeResponse response= new EmployeeResponse();
		response.setStatusCode(501);
		response.setMessage("Error in Code");
		response.setDescription("Got an Exception");
		return response;


	}

}
