package com.ustglobal.Sorting.list;

public class Student implements Comparable <Student>{
	int id;
	String name;
	double percentage;
	
	
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	//@Override
	//public int compareTo(Student s) {
	//	String p = this.name;
	//	String q = s.name;
	//	return p.compareTo(q);
	
	@Override
	public int compareTo (Student s) {
		Integer i = this.id;
		Integer j = s.id;
		return i.compareTo(j);
		
	
	}
		
	}
	
	
	
	

