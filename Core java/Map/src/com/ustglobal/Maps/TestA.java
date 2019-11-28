package com.ustglobal.Maps;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		HashMap h1=new HashMap();
		h1.put("kuku",9876422);
		h1.put("mala",9876412);
		h1.put("sheela",9877422);
		h1.put(null, 987654321);
		h1.put(null, 987654320);
		
		System.out.println("data " +h1);
		h1.put("mala", 9834592);
		System.out.println("after modify " +h1);
		
		h1.put("priya" ,9834592);
		System.out.println("after priya " +h1 );
		
		h1.put(null, 7426781);
		System.out.println("after null " +h1);
		System.out.println("========================================");
		
		
		Object phoneno =h1.get("sheela");
		System.out.println("value is " +phoneno);
		System.out.println("=======================================");
		
		Object ph=h1.get("vikram");
		System.out.println("value is" +ph);
		
		System.out.println("=======================================");
		
		Object o =h1.remove("kuku");
		System.out.println("value is " +o);
		System.out.println("after remove " +h1);
		
		
		
		
		
		
	
		
		
	}

}
