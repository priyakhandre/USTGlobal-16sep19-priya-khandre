package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class TestH {
	public static void main(String[] args) {
		Vector li = new Vector();
		li.add(10);
		li.add("priya");
		li.add(10.34);
		li.add(true);
		li.add(null);
		
		System.out.println("---------------using for loop-------------");
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
			
		}
		
		System.out.println("---------using for each----------");
		for (Object obj : li) {
			System.out.println(obj);
			
		}
		
		System.out.println("--------------using iterator----------");
		
		Iterator it = li.iterator();
		while(it.hasNext()) {
			Object o =it.next();
			System.out.println(o);
		}
		
		
		System.out.println("----------------using list iterator ----------");
		
		ListIterator it1 = li.listIterator();
		while(it1.hasNext()) {
			Object o1 = it1.next();
			System.out.println(o1);
		}
		
		System.out.println("---------------using list iteartor backward------------");
		
		while(it1.hasPrevious())
		{
			Object o2 = it1.previous();
			System.out.println(o2);
		}

	}

}
