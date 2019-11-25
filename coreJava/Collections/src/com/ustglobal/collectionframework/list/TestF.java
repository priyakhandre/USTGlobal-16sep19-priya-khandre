package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("anupama");
		al.add("sabitha");
		al.add("priya");
		al.add("pooja");
		
		
		String s=al.get(0);
		System.out.println(s.toUpperCase());
		Iterator<String> it =al.iterator();
		while(it.hasNext()) {
			String s1=it.next();
			System.out.println(s1);
		}
		
		System.out.println("------------using list iterator---------------------");
		ListIterator<String> li = al.listIterator();
		while(li.hasNext()) {
			String s2=li.next();
			System.out.println(s2);
		}
		
		
		System.out.println("-------------using for each----------------");
		for (String n : al) {
			System.out.println(n);
			
		}
		
	}

}
