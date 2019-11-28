package com.ustglobal.object_class;

public class TestD {
	public static void main(String[] args) {
		
		Student s1=new Student(101,"priya",78.96);
		int h=s1.hashCode();
		System.out.println(h);
		String s=s1.toString();
		System.out.println(s);

	}

}
