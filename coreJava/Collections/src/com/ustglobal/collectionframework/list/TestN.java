package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestN {
	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList<>();
		al.add("priya");
		al.add("pooja");
		al.add("chinnu");
		al.add("vineet");
		
		System.out.println("before Sort -----> " +al);
		Collections.sort(al);
		System.out.println("After sort -------> " +al);
		
	}

}
