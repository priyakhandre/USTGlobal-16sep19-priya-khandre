package com.ustglobal.Sorting.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
	public static void main(String[] args) {
		LinkedList<laptop> li = new LinkedList<>();
		laptop l1 = new laptop (24000,6,"HP");
		laptop l2 = new laptop (27000,7,"Dell");
		laptop l3 = new laptop (25000,8,"Mac");
		laptop l4 = new laptop (22000,9,"Asus");
		
		
		li.add(l1);
		li.add(l2);
		li.add(l3);
		li.add(l4);
		li.add(new laptop (20000,5,"acer"));
		displaylaptopDetails(li);
	}
	static void displaylaptopDetails (LinkedList<laptop> l) {
		Iterator<laptop> it = l.iterator();
		while(it.hasNext()) {
			laptop lp =it.next();
			System.out.println("brand is " +lp.name);
			System.out.println("price is " +lp.price);
			System.out.println("Ram is " +lp.ram);
		}
	}

}
