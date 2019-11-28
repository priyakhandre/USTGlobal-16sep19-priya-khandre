package com.ustglobal.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytomany.Course;
import com.ustglobal.jpawithhibernateapp.manytomany.Student;


public class ManyToMany {
	public static void main(String[] args) {
		Course c = new Course();
		c.setCid(10);
		c.setCname("java");
		
		Course c1= new Course();
		c1.setCid(11);
		c1.setCname("SQL");
		ArrayList<Course> course = new ArrayList<Course>();
		course.add(c);
		course.add(c1);
		
		
		
		
		Student s1=new Student();
		s1.setSid(101);
		s1.setSname("priya");
		s1.setCourse(course);
		
		
		EntityTransaction entityTransaction = null;
        EntityManager entityManager = null;
        
        
		
		
		
		
		
        try {
        
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		System.out.println("record saved");
		System.out.println(s1);
	    entityTransaction.commit(); 
	
	}catch (Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
        entityManager.close();

}
		
	}


