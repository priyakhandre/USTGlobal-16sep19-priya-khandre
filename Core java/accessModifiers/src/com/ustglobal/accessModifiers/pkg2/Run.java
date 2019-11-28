package com.ustglobal.accessModifiers.pkg2;

public class Run {
	public static void main(String[] args) {
		 demo d=new demo ();
		 // System.out.println(d.a);
		 //  d.add(); it is not possible in private
		 //default 
		 System.out.println(d.b);
		 d.sub();
		 //protected 
		 System.out.println(d.c);
		 d.mul();
		 //public 
		 System.out.println(d.name);
		 d.div();
	}

}
