package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestK {
	public static void main(String[] args) {
		ArrayList<Student> a1 = new ArrayList<Student>();
		Student s1 = new Student (101,"priya",45.6);
		Student s2 = new Student (102 , "salman" , 87.6);
		Student s3 = new Student (103 ,"yash" , 76.6);
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		for (int i = 0; i < a1.size(); i++) {
			Student s=a1.get(i);
			System.out.println("id is " +s.id);
			System.out.println("name is " +s.name);
			System.out.println("percentage is " +s.percentage);
			
			
			
		}
		
		System.out.println("---------------for each----------");
		for (Student s : a1) {
			
			System.out.println(s);
			
		}
		
		
		
	}

}
