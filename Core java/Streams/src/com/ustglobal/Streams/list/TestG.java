package com.ustglobal.Streams.list;

import java.util.ArrayList;

public class TestG {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student> ();
		al.add(new Student (5,"vikram" ,97.56));
		al.add(new Student (6,"pooja" ,68.56));
		al.add(new Student (7,"shantu" ,77.56));
		al.add(new Student (2,"swathi" ,00.56));
		al.add(new Student (4,"som" ,67.06));
		al.add(new Student (9,"yash" ,64.56));
		
		Helper h1=new Helper();
		// h1.displayAllStudent(al);
		//h1.displayFailedStudent(al);
		h1.displayTopper(al);
	
		
	}

}
