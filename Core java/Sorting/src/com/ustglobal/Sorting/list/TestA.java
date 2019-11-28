package com.ustglobal.Sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
	   Student s1 = new Student(12,"priya",36.56);
	   Student s2 = new Student(13,"pooja",38.56);
	   Student s3 = new Student(42,"chinnu",32.56);
	   Student s4 = new Student(15,"som",36.56);
	   
	   al.add(s1);
	   al.add(s2);
	   al.add(s3);
	   al.add(s4);
	   displayStudentDetails(al);
	   Collections.sort(al);
	   
	   
	}
	
	static void displayStudentDetails(ArrayList<Student> al) {
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
		Student s=	it.next();
		System.out.println("id is" +s.id);
		System.out.println("name is" +s.name);
		System.out.println("percentage is" +s.percentage);
		System.out.println("========================");
		}
	}

}
