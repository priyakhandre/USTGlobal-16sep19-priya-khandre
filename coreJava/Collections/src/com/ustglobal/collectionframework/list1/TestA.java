package com.ustglobal.collectionframework.list1;

import java.util.ArrayList;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		
	
	ArrayList<Student> st = new ArrayList<>();
	st.add(new Student(1,"Gajendra",79.95,9176070061l,"Male"));
	st.add(new Student(2,"Shikha",89.95,9993970061l,"Female"));
	st.add(new Student(3,"Rahul",69.95,9976070061l,"Male"));	
	st.add(new Student(4,"Nidhi",99.95,89176070061l,"Female"));
	st.add(new Student(5,"Neha",80.95,8176070061l,"Female"));

	System.out.println("====================Using For Each loop=======================");

	for (Student student : st) {

		System.out.println(" Detail of "+student);
	}
	System.out.println("============ Using Iterator================================== ");

	Iterator<Student> it = st.iterator();

	while(it.hasNext()) {

		Object o = it.next();
		System.out.println(o);

	}
	}



}
