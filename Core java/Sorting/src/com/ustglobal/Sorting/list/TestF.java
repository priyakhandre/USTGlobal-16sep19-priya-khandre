package com.ustglobal.Sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestF {
	public static void main(String[] args) {
		ArrayList<Marker> al = new ArrayList<> ();
		al.add(new Marker(50,"blue"));
		al.add(new Marker(60,"Red"));
		al.add(new Marker(90,"Black"));
		al.add(new Marker(40,"green"));
		
		System.out.println("before sorting ------->");
		display(al);
		SortByPrice sb=new SortByPrice();
		SortByColor sc=new SortByColor();
		
		Collections.sort(al, sc);
		System.out.println("After sorting -------->");
		display(al);
		
		
		
	}
	
	static void display(ArrayList<Marker> a) {
		Iterator<Marker> it = a.iterator();
		while(it.hasNext()) {
			Marker m = it.next();
			System.out.println("price is " +m.price);
			System.out.println("color is " +m.color);
			
		}
		
	}

}
