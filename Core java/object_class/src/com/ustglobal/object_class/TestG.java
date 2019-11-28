package com.ustglobal.object_class;

public class TestG {
	public static void main(String[] args) {
		Employee E1 = new Employee(1,"priya",50000);
		Employee E2 = new Employee (2,"pooja",56000);
		Employee E3 = new Employee (3,"som",76000);
		Employee E4= E1;
		System.out.println(E1.equals(E2));
		System.out.println(E2.equals(E3));
		System.out.println(E3.equals(E4));
		System.out.println(E1.equals(E4));
		
	}

}
