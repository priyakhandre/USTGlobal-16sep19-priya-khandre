package com.ustglobal.Streams.list;

import java.util.ArrayList;
import java.util.Comparator;

public class ClassD {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(12);
		al.add(50);
		al.add(18);
		al.add(28);
		al.add(11); 
		
		Comparator<Integer> cmp = (m1 , m2) -> {
			if(m1>m2) {
				return 1;
			}else if(m1<m2) {
				return -1;
			}else {
				return 0;
			}
		};
		long noOfFailedStudent = al.stream().filter(i -> i<40).count();
		System.out.println(noOfFailedStudent);
		System.out.println("=========================");
		Integer i =al.stream().min(cmp).get();
		System.out.println("min value " +i);
		
		System.out.println("=========================");
		Integer j = al.stream().max(cmp).get();
		System.out.println("max value is " +j);
	}
   

}
