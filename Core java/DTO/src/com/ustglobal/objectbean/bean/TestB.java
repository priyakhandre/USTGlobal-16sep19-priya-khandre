package com.ustglobal.objectbean.bean;

public class TestB {
	public static void main(String[] args) {
		employee e=new employee ();
		e.setId(12);
		e.setDept("xyz");
		e.setDesignation("manager");
		e.setName("priya");
	    e.setSalary(2000000);
	    
	    
		
		
		database1 db1=new database1();
		db1.recieve(e);
		
	}

}
