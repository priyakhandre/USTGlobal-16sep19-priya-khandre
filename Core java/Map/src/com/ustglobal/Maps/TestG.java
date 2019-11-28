package com.ustglobal.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {
		Student s1 = new Student(2,"priya" ,56.345);
		Student s2 = new Student(5,"pooja" ,57.345);
		Student s3 = new Student(8,"chinnu" ,26.345);
		Student s4 = new Student(12,"som" ,50.345);
		Student s5 = new Student(4,"vikram" ,16.345);
		Student s6 = new Student(10,"shantu" ,86.345);
		Student s7 = new Student(15,"swathi" ,96.345);
		Student s8 = new Student(3,"dimple" ,59.345);
		Student s9 = new Student(11,"sweety" ,26.345);
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		ArrayList<Student> al1 = new ArrayList<>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		ArrayList<Student> al2 = new ArrayList<>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		HashMap<String,ArrayList<Student>> hm = new HashMap<>();
		hm.put("first" , al);
		hm.put("second" , al1);
		hm.put("third" , al2);
		
		ArrayList<Student> first=hm.get("second");
		
		Iterator<Student> it = first.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is " +s.id);
			System.out.println("name is " +s.name);
			System.out.println("percentage is " +s.percentage);
			System.out.println("===============================;");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
