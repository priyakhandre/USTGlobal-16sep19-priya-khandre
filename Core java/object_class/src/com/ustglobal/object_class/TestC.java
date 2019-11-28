package com.ustglobal.object_class;

public class TestC {
	public static void main(String[] args) {
		Marker m=new Marker () ;
		int hash=m.hashCode();
		System.out.println(hash);
		String str=m.toString();
		System.out.println(str);
		
	}

}
