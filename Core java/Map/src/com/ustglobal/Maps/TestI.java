package com.ustglobal.Maps;

import java.util.Hashtable;

public class TestI {
	public static void main(String[] args) {
		Hashtable <Integer , String> ht = new Hashtable<>();
		ht.put(101, "ajay");
		ht.put(500, "sonu");
		ht.put(109, "monu");
		ht.put(110, "vijay");
		ht.put(101, "shree");
		ht.put(105,"ax");
		// ht.put(null, "john");  //null pointer exception
		//ht.put(108,null); null pointer exception.0.00
		System.out.println(ht);

		
	}

}
