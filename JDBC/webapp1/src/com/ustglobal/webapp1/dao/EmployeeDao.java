package com.ustglobal.webapp1.dao;

import com.ustglobal.webapp1.dto.EmployeeInfo;

public interface EmployeeDao {
	
	public EmployeeInfo auth(int id,String password);
	
	public EmployeeInfo searchEmployee(int id);
	
	public boolean changePassword(int id , String password);
	
	public boolean registerEmployee(EmployeeInfo info);
	

}
