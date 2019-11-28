package com.ustglobal.Arrays;

public class student {
	int id;
	String name;
	double percentage;
	public student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	

}
