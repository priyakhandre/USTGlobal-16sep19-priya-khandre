package com.ustglobal.EmpApp.util;

import com.ustglobal.EmpApp.DAO.EmployeeDAO;
import com.ustglobal.EmpApp.DAO.EmployeeDAOimpl;

public class EmployeeManager {
	
	private EmployeeManager() {}
	
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOimpl();
		
	}

}
