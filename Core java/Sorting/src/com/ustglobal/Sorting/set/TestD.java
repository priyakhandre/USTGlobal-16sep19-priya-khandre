package com.ustglobal.Sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		LinkedHashSet<Double> ls = new LinkedHashSet();
		ls.add(12.3);
		ls.add(2.35);
		ls.add(1.3);
		ls.add(75.3);
		ls.add(134.39);
		System.out.println("********using for each ********");
		for (Double d : ls) {
			
			System.out.println(d);
			
		}
		System.out.println("***using iterator********");
		Iterator<Double> it = ls.iterator();
		
		while(it.hasNext()) {
			Object p=it.next();
			System.out.println(p);
		}
		
		
		
	
	}

}
