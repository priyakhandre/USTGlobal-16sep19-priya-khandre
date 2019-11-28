package com.ustglobal.Assignment2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.Assignment2.dto.Student;

public class InsertDemo {
	public static void main(String[] args) {
		Student student = new Student();
		student.setId(2);
		student.setName("som");
		student.setGender("M");
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		System.out.println("record saved");
		entityTransaction.commit();
		entityManager.close();
		
		
	}

}
