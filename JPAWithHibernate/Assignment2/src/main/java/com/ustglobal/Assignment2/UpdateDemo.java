package com.ustglobal.Assignment2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.Assignment2.dto.Student;



public class UpdateDemo {
	public static void main(String[] args) {
		
	
	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
	try {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
	entityManager = entityManagerFactory.createEntityManager();
    entityTransaction = entityManager.getTransaction();
	entityTransaction.begin();
	Student student = entityManager.find(Student.class, 1);
	student.setName("pooja");
	student.setGender("F");
	System.out.println("record updated");
	entityTransaction.commit();
	
	}catch(Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}

}
}
