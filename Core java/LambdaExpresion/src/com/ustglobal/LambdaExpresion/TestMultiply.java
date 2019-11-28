package com.ustglobal.LambdaExpresion;

public class TestMultiply {
	public static void main(String[] args) {


		MultiplyInterface multi = (a,b) -> a*b ;
		int product = multi.Multiply(20, 10);
		System.out.println("product is " +product);

}
}
