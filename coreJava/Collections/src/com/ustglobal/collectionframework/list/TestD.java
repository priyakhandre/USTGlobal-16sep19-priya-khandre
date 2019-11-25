package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList ();
		al.add(10);
		al.add(45.6);
		al.add("yash");
		al.add(true);
		
		ListIterator li = al.listIterator();
		System.out.println("--------------------FORWARD-----------");
		while(li.hasNext()) {
			Object o1 = li.next();
			System.out.println(o1);
		}
		System.out.println("----------BACKWARD-------");
		while(li.hasPrevious()){
			Object o = li.previous();
			System.out.println(o);
		}
			
		
		
	}

}
