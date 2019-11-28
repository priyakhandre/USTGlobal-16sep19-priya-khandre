package com.ustglobal.object_class;

public class TestF {
	public static void main(String[] args) {
		Cow c1=new Cow(1 , "swathi" ,10000);
		Cow c2 = new Cow(2,"shantu",20000);


		Cow c3 = c2;

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());

		boolean b=c1.equals(c2);
		System.out.println(b);
		System.out.println(c2.equals(c3));

	}

}
