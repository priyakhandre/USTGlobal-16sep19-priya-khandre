package com.ustglobal.collectionframework.list;


import java.util.ArrayList;
import java.util.List;

public class TestL {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(34.56);
		al.add(23.67);
		al.add(34.78);
		al.add(12.456);
		al.add(34.67);
		al.add(null);
		al.add(null);
		System.out.println(al);
		al.add(2,54.67);
		System.out.println("After add in 2nd index " +al);
		al.remove(0);
		System.out.println("after remove 0th index " + al);
		al.remove(null);
		System.out.println("After remove of null index" +al);
		Double a1=al.get(4);
		System.out.println("object at 4th element is" +a1);
		al.set(2, 59.45);
		System.out.println("after replacing 2nd index" +al);
		al.clear();
		System.out.println("after clear method" +al);
		al.contains(54.67);
		
		
		
		List<Double> al1 = new ArrayList<> ();
		al1.add(12.45);
		al1.add(34.67);
		al1.add(45.78);
		
		al.addAll(al1);
		System.out.println(al);
		
		boolean contains = al.containsAll(al1);
		System.out.println(contains);
		
		
		boolean res = al.removeAll(al1);
		System.out.println(res);
		
		
		
		
	}

}
