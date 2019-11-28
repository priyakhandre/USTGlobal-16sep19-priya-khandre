package com.ustglobal.object_class;

public class Remote {
	void add() {
		System.out.println("add () method");
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Remote r1=new Remote();
		Class c=r1.getClass();
		Object o=c.newInstance();
		Remote q=(Remote)o;
		q.add();
		 
	}

}
