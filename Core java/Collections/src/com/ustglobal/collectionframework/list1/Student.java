package com.ustglobal.collectionframework.list1;
class Student{

	int id;
	String name ;
	Double percentage;
	long number;
	String sex;

	public Student(int id, String name, Double percentage, long number, String sex) {

		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		this.number = number;
		this.sex = sex;
	}
	@Override
	public String toString() {

		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + ", number=" + number + ", sex="
				+ sex + "]";
	}

}