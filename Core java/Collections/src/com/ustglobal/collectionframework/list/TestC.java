package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
public static void main(String[] args) {
	ArrayList al = new ArrayList ();
	al.add(23);
	al.add("vikram");
	al.add(35.6);
	al.add("true");
	
	Iterator it = al.iterator();  
	Object ob=it.next();
	System.out.println("obj is " +ob);
	
	Object o2 = it.next();
	System.out.println("obj2 is " +o2);
	
	Object o3 = it.next();
	System.out.println("obj3 is " +o3);
	
	Object o4 = it.next();
	System.out.println("obj4 is " +o4);
	
	boolean b=it.hasNext();
	System.out.println(b);
	
//	Object o5 = it.next();
//	System.out.println("objs is " +o5);
	
	
	
	for (int i =0;i<al.size() ; i++) {
		Object o = al.get(i);
		System.out.println(o);
	}
	
	ArrayList ai = new ArrayList();
	ai.add(2);
	ai.add("kappi");
	ai.add(22.5);
	ai.add(true);
	
	System.out.println("=========================================");
	
	Iterator it1 = ai.iterator();
	while(it1.hasNext()) {
		Object o=it1.next();
		System.out.println(o);
	}
	
		
	
	
}
}
