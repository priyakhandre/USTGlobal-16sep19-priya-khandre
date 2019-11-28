package com.ustglobal.Maps;


import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {
	public static void main(String[] args) {
		LinkedHashMap<String , Integer> lh = new LinkedHashMap<>();
		lh.put("Banglore", 560068);
		lh.put("Hariyana", 134203);
		lh.put("patna", 880000);
		
		System.out.println(lh);
		
		Set<String> s = lh.keySet(); //to get key or names		
		for (String key : s) {
			System.out.println("key is " +key);
			
		}
		
		Collection<Integer> c=lh.values(); //to get values 
		for (Integer value : c) {
			System.out.println("value is " +value);
			
		}
		
		
	}

}
