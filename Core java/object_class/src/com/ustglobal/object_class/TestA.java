package com.ustglobal.object_class;

public class TestA {

	public static void main(String[] args) {
		Mouse m=new Mouse();
	    Usbport.connect(m);
	    
	    pendrive p=new pendrive();
	    Usbport.connect (p);
	   
	 

	}

}