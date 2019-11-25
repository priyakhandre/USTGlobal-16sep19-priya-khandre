package com.ustglobal.accessModifiers.pkg1;

import com.ustglobal.accessModifiers.pkg2.demo;

public class sample extends demo{
	public static void main(String[] args) {
		 demo d=new demo ();
			// System.out.println(d.a);
			//  d.add(); it is not possible in private
			 //default 
			//  System.out.println(d.b);
			 // d.sub();
			 //protected 
		 sample s1=new sample ();
			 System.out.println(s1.c);
			 s1.mul();
			 //public 
			 System.out.println(s1.name);
			 s1.div();
		}
		
	
	

}
