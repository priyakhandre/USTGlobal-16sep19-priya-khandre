package com.ustglobal.Maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		HashMap h1=new HashMap();
		h1.put("kuku",9876422);
		h1.put("mala",9876412);
		h1.put("sheela",9877422);
		
		HashMap hm1 = new HashMap();
		hm1.put("deepu", 9875234);
		hm1.put("riya", 9734512);
		hm1.put("kriti", 4567210);
		
		
		boolean haskey=h1.containsKey("mala");
		System.out.println("has key " +haskey);
		
		boolean haskey1=h1.containsValue(4567210);
		System.out.println("has value " +haskey1);
		
		
		h1.putAll(hm1); //copy one hashmap to another hashmap
		System.out.println("after put all " +h1);
		
		System.out.println(h1.size());
		
		h1.clear();
		System.out.println("after clear " +h1);
		
		
	}

}
