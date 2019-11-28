package com.ustglobal.object_class;

public class TestE {
	public static void main(String[] args) {
		Car c1=new Car(120000,"Audi","red");
		int hash=c1.hashCode();
		String str=c1.toString();
		System.out.println(hash);
		System.out.println(str);
	}

}
