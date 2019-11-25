package com.ustglobal.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestM {
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<> (); //have to pass only generic type and we should not pass null
		li.add(12);   //if we pass non generic then class cast Exception
		li.add(15);
		li.add(45);
		li.add(3);
		System.out.println("before sorting" +li);
		Collections.sort(li);
		System.out.println("After sorting " +li);
		
		Collections.reverse(li);  //return type of reverse is void
		System.out.println("after reversing " +li) ;
		
		Collections.shuffle(li);;
		System.out.println("After shuffle " +li);
		
		
	}

}
