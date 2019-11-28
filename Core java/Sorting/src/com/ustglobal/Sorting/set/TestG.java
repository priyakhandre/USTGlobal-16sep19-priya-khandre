package com.ustglobal.Sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestG {
	public static void main(String[] args) {
		Comparator <Employee> cmp =(e1,e2) -> {
			if(e1.height>e2.height) {
				return 1;
			}else if(e1.height<e2.height) {
				return -1;
			}else
				return 0;
		};
		TreeSet<Employee> ts= new TreeSet<>(cmp);		
		
		Employee e1 = new Employee (4 , "priya" , 5.234);
		Employee e2 = new Employee (7 , "pooja" , 5.334);
		Employee e3 = new Employee (2 , "som" , 6.0);
		Employee e4 = new Employee (9 , "vikram" , 5.9);
		Employee e5 = new Employee (1 , "swathi" , 5.2);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		
		System.out.println("*******using iterator*******");
		
		Iterator<Employee> it = ts.iterator();
		while(it.hasNext()) {
			Employee e=it.next();
			System.out.println("id is " +e.id);
			System.out.println("name is " +e.name);
			System.out.println("height is " +e.height);
		}
		
		
		
	}

}
