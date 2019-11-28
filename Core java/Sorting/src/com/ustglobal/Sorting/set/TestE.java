package com.ustglobal.Sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();

		ts.add(34);
		ts.add(45);
		ts.add(10);
		ts.add(9);
		ts.add(11);
		//null not allowed and non generic
	//	ts.add("priya"); class cast exception 
		//ts.add(null); nullpointer exception 
		
		System.out.println("****using for each******** ");
		for (Object o : ts) {
			System.out.println(o);
			
		}
		System.out.println("****using iterator *********");
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			Object p=it.next();
			System.out.println(p);
		}
		
		
		
	}

}
