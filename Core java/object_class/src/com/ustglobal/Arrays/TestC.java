package com.ustglobal.Arrays;

public class TestC {
	public static void main(String[] args) {
		
	
	student s1=new student(1,"arya",67.56);
	student s2=new student(2,"priya",97.56);
	student s3=new student(3,"pooja",68.56);
	student s4=new student(4,"som",60.56);


	student [] students = new student[3];
	students[0]= s1;
	students[1]= s2;
	students[2]= s3;
	
	
	for (student s : students)
	{
		System.out.println(s);
	}
	
	recieve (students);
	}
	
	
	static void recieve(student[] stu) {
		for (student s: stu) {
		System.out.println(s);
	}
	}



}

