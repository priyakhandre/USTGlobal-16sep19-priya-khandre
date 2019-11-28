package com.ustglobal.Sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet <>();
		ts.add("priya");
		ts.add("divya");
		ts.add("roopa");
		ts.add("vikram");
		
		System.out.println("****using for each*****");
		for (String s : ts) {
			System.out.println(s);
			
		}
		System.out.println("*******using iterator*****");
		Iterator <String> it = ts.iterator();
		while(it.hasNext()) {
			String p = it.next();
			System.out.println(p);
		}
		
	}

}
