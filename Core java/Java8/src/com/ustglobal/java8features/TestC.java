package com.ustglobal.java8features;

import java.util.function.Function;

public class TestC {
	public static void main(String[] args) {
		
		Function<Integer , Integer> f = i-> i*i;    //return type other than boolean value
		
		int res=f.apply(5);
		System.out.println(res);
		int res1=f.apply(25);
		System.out.println(res1);
	}

}
