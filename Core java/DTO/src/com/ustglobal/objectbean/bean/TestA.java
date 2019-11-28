package com.ustglobal.objectbean.bean;

public class TestA {
	public static void main(String[] args) {
		student s=new student ();
		s.setId(12);
		s.setName("priya");
		s.setRollNo(123);
		
		Database db=new Database();
		db.recieve(s);
		
		
	}

}
