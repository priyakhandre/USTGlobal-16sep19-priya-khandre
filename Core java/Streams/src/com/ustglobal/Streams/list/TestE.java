package com.ustglobal.Streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestE {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(12);
		al.add(50);
		al.add(18);
		al.add(28);
		al.add(11); 
		
		List<Integer> l = al.stream().sorted().collect(Collectors.toList());
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println("sorted --------->");
			System.out.println(i);
		}
		
		
	}

}
