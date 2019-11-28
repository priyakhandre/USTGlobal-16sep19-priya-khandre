package com.ustglobal.Maps;

import java.util.Map;
import java.util.TreeMap;

public class TestF {
	public static void main(String[] args) {
		TreeMap<String , Integer> lh = new TreeMap<>();
		lh.put("Banglore", 560068);
		lh.put("Hariyana", 134203);
		lh.put("patna", 880000);
	//	lh.put(null, 98644); //null pointer exception 
		System.out.println(lh);
		
		for (Map.Entry<String, Integer> m : lh.entrySet()) {
			Integer value = m.getValue();
			String key = m.getKey();
			System.out.println(key);
            System.out.println(value);			
			
			
		}
		
		
		
		
	}

}
