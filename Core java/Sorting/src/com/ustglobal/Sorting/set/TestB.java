package com.ustglobal.Sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
public static void main(String[] args) {
	HashSet<String> hs  = new HashSet<> ();
	hs.add("ram");
	hs.add("sham");
	hs.add("priya");
	hs.add("shantu");
	
	System.out.println("*using for each****");
	{
		for (String s : hs) {
			System.out.println(s);
			
		}
		System.out.println("*****using iterator******");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			Object o =it.next();
			System.out.println(o);
			
			
		}
	}
	}
}
