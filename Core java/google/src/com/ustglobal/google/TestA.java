package com.ustglobal.google;

public class TestA {
	public static void main(String[] args) {
		browser b=new browser();
		google g=new gmail();
		b.open(g);
		google  gd=new  googleDrive();
		b.open(gd);
	}

}
