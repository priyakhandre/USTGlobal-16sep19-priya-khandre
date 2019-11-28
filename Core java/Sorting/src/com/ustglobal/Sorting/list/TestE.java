package com.ustglobal.Sorting.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestE {
	public static void main(String[] args) {
		
		LinkedList<Pen> p = new LinkedList<> ();
		
		Pen p1 = new Pen(240,"parker");
		Pen p2 = new Pen(340,"renolds");
		Pen p3 = new Pen(640,"xyz");
		Pen p4 = new Pen(840,"moto");
		Pen p5 = new Pen(540,"abc");
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		displayPenDetails(p);
		
		
		
		
		
	}
	
	static void displayPenDetails (LinkedList<Pen> p) {
		Iterator<Pen> it = p.iterator();
		while(it.hasNext()) {
			Pen pl =it.next();
			System.out.println("brand is " +pl.price);
			System.out.println("price is " +pl.brand);
			
		}

}
}
