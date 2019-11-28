package com.ustglobal.Sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(12);
		hs.add(54.34);
		hs.add("priya");
		hs.add(12);
		hs.add(54.34);
		hs.add(null);
		
		
		System.out.println("***using for each *********");
		for (Object o : hs) {
			System.out.println(o);
			
		}
		
		System.out.println("********using itrator*****");
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object o =it.next();
			System.out.println(o);
			
			
		}
		
		
		
	}

}
