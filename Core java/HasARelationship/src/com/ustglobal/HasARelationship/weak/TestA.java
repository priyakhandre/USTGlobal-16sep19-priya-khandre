package com.ustglobal.HasARelationship.weak;

public class TestA {
	public static void main(String[] args) {
		person p = new person() ;
		System.out.println(p.name);
		p.sleep();
		p.eat();
		p.m.write();
	}

}
