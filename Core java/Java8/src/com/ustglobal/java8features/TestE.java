package com.ustglobal.java8features;

import java.util.function.Supplier;

public class TestE {
	public static void main(String[] args) {
		Supplier<Student> s = () -> new Student(2 , "priya" ,45.98);
		Student res=s.get();
		System.out.println(res.id);
		System.out.println(res.name);
		System.out.println(res.percentage);
		
		Supplier<Integer> i = ()-> 20;
			int val =i.get();
			System.out.println(val);
			
			Supplier<String> sp = () -> "good Evening";
			String v = sp.get();
			System.out.println("value is " +v);
		
	}
		

}
