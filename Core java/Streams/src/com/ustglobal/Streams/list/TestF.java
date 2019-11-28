package com.ustglobal.Streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e1 = new Employee(1,"priya");
		Employee e2 = new Employee(4,"pooja");
		Employee e3 = new Employee(2,"chinnu");
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		Comparator <Employee> cmp =(e5,e6) -> {
			return e5.name.compareTo(e6.name);
		};
		
		List<Employee> e=al.stream().sorted(cmp).collect(Collectors.toList());
		Iterator<Employee> it = e.iterator();
		while(it.hasNext()) {
			Employee res=it.next();
			System.out.println("id is " +res.id);
			System.out.println("name is " +res.name);
		}
	}

}
