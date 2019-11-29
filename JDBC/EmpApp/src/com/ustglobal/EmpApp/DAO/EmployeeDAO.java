package com.ustglobal.EmpApp.DAO;

import java.util.List;

import com.ustglobal.EmpApp.dto.EmployeeBean;

public interface EmployeeDAO {
	public List<EmployeeBean> getAllEmployeeData();
	public EmployeeBean SearchEmployeeData(int id);
	public int insertEmployeeData(EmployeeBean bean2);
	public int updateEmployeeData(EmployeeBean bean3);
	public int deleteEmployeeData(EmployeeBean bean4);
	
	

}
