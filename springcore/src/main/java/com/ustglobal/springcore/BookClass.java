package com.ustglobal.springcore;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.bookconfig.Book;

public class BookClass {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("Book.xml");
		Book book = context.getBean(Book.class);
		System.out.println(book.getAuthor());
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		
		
		
	}

}
