package com.ustglobal.Sorting.list;


import java.util.Iterator;
import java.util.TreeSet;

public class TestH {
	public static void main(String[] args) {
		TreeSet<Employee> hs = new TreeSet <>();
		Employee e1 = new Employee(12,"sweety" ,65000);
		Employee e2 = new Employee(13,"priya" ,65000);
		Employee e3 = new Employee(14,"pooja" ,63000);
		Employee e4 = new Employee(15,"vikram" ,65300);
		Employee e5 = new Employee(16,"som" ,65070);
		Employee e6 = new Employee(16,"som" ,65070);

		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		hs.add(e6);
		System.out.println("************using iterator**********");
		Iterator <Employee> it = hs.iterator();
		while(it.hasNext()) {
			Employee e=it.next();
			System.out.println("id is " +e.id);
			System.out.println("name is " +e.name);
			System.out.println("salary is " +e.salary);
			System.out.println("=====================================");


		}

	}

}
