package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

public class TestA {
	public static void main(String[] args) {
		
		Predicate<Employee> p = e ->{ //if return type is boolean then only predicate                                             
			if(e.salary >=50000) {
				return true;
			}else {
				return false;
			}
			
		};
		Employee e = new Employee(1,"priya",78000);
		boolean res = p.test(e);
		System.out.println(res);
	}

}
