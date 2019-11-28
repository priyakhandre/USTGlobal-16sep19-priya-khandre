package com.ustglobal.LambdaExpresion;

public class TestSquare {
	public static void main(String[] args) {
		SquareInterface sq=x ->x*x;
		int value=sq.Sqaure(5);
		System.out.println(value);
	}

}
