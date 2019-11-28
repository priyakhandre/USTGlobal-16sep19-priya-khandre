package com.ustglobal.object_class;

public class Student {
	int id;
	String name;
	double percentage;

	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	public int hashCode() {
		return id;

	}

	public String toString () {
		return "name is " +name+ "id is " +id+ "percentage is " +percentage;

	}





}
