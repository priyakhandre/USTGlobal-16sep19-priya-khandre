package com.ustglobal.object_class;

public class TestI {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1=new Person(1,"chotu");
		System.out.println("p1 of is " +p1.id);
		System.out.println("p1 is " +p1.name);
		
		Object p=p1.clone();
		Person p2 = (Person)p;
		System.out.println("p2 id is " +p2.id);
		System.out.println("p2 name is " +p2.name);
		System.out.println(p2.id = 200);
		System.out.println(p2.name = "surya");
		System.out.println("------------after cloning---------------");
	}

}
