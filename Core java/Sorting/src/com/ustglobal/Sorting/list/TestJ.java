package com.ustglobal.Sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {
	
	public static void main(String[] args) {
		SortByCname sc=new SortByCname();
		SortByCid si=new SortByCid();
		TreeSet<Customer> ts = new TreeSet<> (si);
		Customer c1 = new Customer ("priya",101,45000);
		Customer c2 = new Customer ("pooja",106,45070);
		Customer c3 = new Customer ("chinnu",109,42000);
		Customer c4 = new Customer ("vikram",103,45060);
		Customer c5 = new Customer ("som",102,45940);
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		ts.add(c5);
		
		System.out.println("======using iterator=========");
		Iterator<Customer> it = ts.iterator();
		while(it.hasNext()) {
		Customer c=it.next();
		System.out.println("name is " +c.name);
		System.out.println("id is " +c.id);
		System.out.println("salary is " +c.salary);
		}
			
		
		
		
		
		
	}

}
