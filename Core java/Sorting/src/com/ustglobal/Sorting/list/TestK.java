package com.ustglobal.Sorting.list;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestK {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(12);
		pq.add(24);
		pq.add(14);
		pq.add(45);
		pq.offer(89);
		
		System.out.println("**********using itrator *******");
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(pq.poll());
		
		}
		System.out.println("After poll " +pq);
		
	
	}

}
