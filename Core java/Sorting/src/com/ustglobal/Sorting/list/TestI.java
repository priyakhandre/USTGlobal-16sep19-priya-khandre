package com.ustglobal.Sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
	public static void main(String[] args) {
		SortByName sb = new SortByName();
		SortByPincode sp = new SortByPincode();
		SortByMicr mr=new SortByMicr();
		TreeSet<Bank> ts = new TreeSet<Bank> (sb);
		Bank b1 = new Bank ("SBI" , 560068,6786790);
		Bank b2 = new Bank ("HDFC" , 560064,6734290);
		Bank b3 = new Bank ("ICICI" , 560048,6788990);
		Bank b4 = new Bank ("UCO" , 562068,67829012);
		Bank b5 = new Bank ("Syndicate" , 561068,6782678);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		
		System.out.println("**********using iterator*********");
		Iterator <Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank b=it.next();
			System.out.println("bank name is " +b.name);
			System.out.println("bank id is " +b.pincode);
			System.out.println("Bank micr is " +b.micr);
			
		}
		
		
		
		
		
	}

}
