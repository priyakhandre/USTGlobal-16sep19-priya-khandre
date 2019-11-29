package com.ustglobal.webapp1.util;

import com.ustglobal.webapp1.dao.EmployeeDao;
import com.ustglobal.webapp1.dao.EmployeeDaoJdbcimpl;

public class EmployeeDaoManager {
	
	private EmployeeDaoManager() {}
	
	public static EmployeeDao getEmployeeDao () {
		return new EmployeeDaoJdbcimpl ();
	}

}
