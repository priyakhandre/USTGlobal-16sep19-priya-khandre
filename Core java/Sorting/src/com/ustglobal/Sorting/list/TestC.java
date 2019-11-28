package com.ustglobal.Sorting.list;

import java.util.LinkedList;

public class TestC {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		l.add(12);
		l.add(24);
		l.add(56);
		l.add(23);
		
		Integer peekElement=l.peek();
		System.out.println("peek element " +peekElement);
		Integer first=l.peekFirst();
		System.out.println("peek first element is " +first);
		Integer last =l.peekLast();
		System.out.println("peek last element is " +last);
		System.out.println("=========================");
		Integer p1=l.poll();
		System.out.println("poll  element is " +p1);
		System.out.println(l);
		Integer p2=l.pollFirst();
		System.out.println("poll first element is " +p2);
		Integer p3=l.pollLast();
		System.out.println("poll last element is " +p3);
		System.out.println("after poll " +l);
		
		
		l.push(16);
		System.out.println("after push " +l);
		Integer p=l.pop();
		System.out.println("after pop " +p);
		System.out.println("after pop operation " +l);
		
		
	}

}
