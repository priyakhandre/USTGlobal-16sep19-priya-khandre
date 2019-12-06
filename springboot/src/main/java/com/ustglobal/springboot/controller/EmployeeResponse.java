package com.ustglobal.springboot.controller;

import java.util.List;

import com.ustglobal.springboot.dto.EmployeeBean;

public class EmployeeResponse {
	
	private int statusCode;
	private String message;
	private String description;
	private List<EmployeeBean> employeebean;
	public List<EmployeeBean> getEmployeebean() {
		return employeebean;
	}
	public void setEmployeebean(List<EmployeeBean> employeebean) {
		this.employeebean = employeebean;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
