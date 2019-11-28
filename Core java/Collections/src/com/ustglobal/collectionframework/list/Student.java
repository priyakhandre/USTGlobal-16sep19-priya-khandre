package com.ustglobal.collectionframework.list;

public class Student {
	public int id;
	public String name;
	public  double percentage;
	
	public int getId() {
		
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPercentage() {
		return percentage;
	}

	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	

}
