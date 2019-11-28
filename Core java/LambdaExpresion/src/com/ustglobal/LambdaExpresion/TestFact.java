package com.ustglobal.LambdaExpresion;

public class TestFact {
	public static void main(String[] args) {
		FactIntrrface f1 = (n) ->
		{
			int fact = 1;
			for(int i=2;i<=n;i++) {
				fact = fact*i;
			}
			System.out.println(fact);
		};
	
		       
	}

}
