package com.ustglobal.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestH {
	public static void main(String[] args) {
		Employee e1 = new Employee(2,"priya" ,56000);
		Employee e2 = new Employee(5,"pooja" ,57345);
		Employee e3 = new Employee(8,"chinnu" ,26345);
		Employee e4 = new Employee(12,"som" ,50345);
		Employee e5 = new Employee(4,"vikram" ,16345);
		Employee e6 = new Employee(10,"shantu" ,86345);
		Employee e7 = new Employee(15,"swathi" ,96345);
		Employee e8 = new Employee(3,"dimple" ,59345);
		Employee e9 = new Employee(11,"sweety" ,26345);
		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		ArrayList<Employee> al1 = new ArrayList<>();
		al1.add(e4);
		al1.add(e5);
		al1.add(e6);
		ArrayList<Employee> al2 = new ArrayList<>();
		al2.add(e7);
		al2.add(e8);
		al2.add(e9);
		HashMap<Integer,ArrayList<Employee>> hm = new HashMap<>();
		hm.put(1 , al);
		hm.put(2 , al1);
		hm.put(3 , al2);
ArrayList<Employee> first=hm.get(1);

		
		Iterator<Employee> it = first.iterator();
		while(it.hasNext()) {
			Employee s = it.next();
			System.out.println("Id is " +s.id);
			System.out.println("name is " +s.name);
			System.out.println("percentage is " +s.salary);
			System.out.println("===============================;");
		}
	}

}
