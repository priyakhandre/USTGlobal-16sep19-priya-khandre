package com.ustglobal.Arrays;

public class TestB {
	public static void main(String[] args) {
		int[] nums = {10,20,30,40};
		// System.out.println(nums[10]); //arrayIndexoutof BoundException
		recieve(nums);
		int[] values = getArray();
		for(int val :values) {
			System.out.println(val);
		}
		
	}
	static void recieve (int[] numbers) {
		for (int num : numbers) {
			System.out.println(num);
		}
	}
		
		static int[] getArray() {
			int[] values = {20,30,40,50};
			return values;
			
		}
		
		
		String[] str = {"priya","pooja","chinnu","som"};
		static void recieveString(String[] names) {
			
		}
		
		
		
	

}
