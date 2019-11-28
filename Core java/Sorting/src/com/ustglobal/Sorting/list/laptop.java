package com.ustglobal.Sorting.list;

public class laptop implements Comparable<laptop>{
	double price;
	int ram;
	String name;
	
	public laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}
//	@Override
//	public int compareTo (laptop l) {
//		Integer i = this.ram;
//		Integer j = l.ram;
//	return i.compareTo(j);
		
//	 }
	
//	@Override
//	public int compareTo(laptop l) {
//		String d1 = this.name;
//		String d2 = l.name;
//		return d1.compareTo(d2);
//	}
	
	@Override
	public int compareTo(laptop l) {
		Double p = this.price;
		Double q = l.price;
		return p.compareTo(q);
	}
	
	
	
	
	

}
