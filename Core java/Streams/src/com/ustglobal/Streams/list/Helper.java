package com.ustglobal.Streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
	void displayAllStudent(ArrayList<Student> al) {
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("id is " +s.id);
			System.out.println("name is " +s.name);
			System.out.println("percentage is " +s.percentage);
			
			
		}
	}
	void displayFailedStudent(ArrayList<Student> al) {
		List<Student> l= al.stream().filter(Student -> Student.percentage <40).collect(Collectors.toList());
		Iterator<Student> it = l.iterator();
		while(it.hasNext()) {
			Student res=it.next();
			System.out.println("id is " +res.id);
			System.out.println("name is " +res.name);
			System.out.println("percentage is " +res.percentage);
		}
	}
		
		void displayTopper(ArrayList<Student> al) {
	Comparator<Student> cmp = (s1,s2)-> {
		if(s1.percentage>s2.percentage) {
			return 1;
		}else if(s1.percentage<s2.percentage) {
			return -1;
		}else
			return 0;
	};
	
	
		Student s= al.stream().max(cmp).get();
		System.out.println("name is " +s.name);
		System.out.println("id is " +s.id);
		
		System.out.println("percentage is " +s.percentage);
	
				
	}
}


