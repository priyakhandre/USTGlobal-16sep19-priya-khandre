package com.ustglobal.LambdaExpresion;

public class TestAdd  implements AddInterface{
	public static void main(String[] args) {

		TestAdd t1=new TestAdd();
		int sum=t1.Add(10, 20);
		System.out.println(" sum is " +sum);


	}

	@Override
	public int  Add(int a, int b) {
		return a + b;

	}

}
