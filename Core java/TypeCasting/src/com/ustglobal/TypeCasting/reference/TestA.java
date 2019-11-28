package com.ustglobal.TypeCasting.reference;

public class TestA {
	public static void main(String[] args) {
		pen p1=new marker(); // upcasting
		System.out.println(p1.cost);
		p1.write();
		
		marker m = (marker)p1; //downcasting
		System.out.println(m.size);
		m.color();
		m.write();  
		m.read();
		
		
	}

}
