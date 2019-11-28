package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.product;

public class InsertDemo {
	public static void main(String[] args) {
		product prod = new product();
		prod.setPid(103);
		prod.setPname("tab");
		prod.setQuantity(100);
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();  //wen will do DML operation
		entityManager.persist(prod);
		System.out.println("record saved");
	    entityTransaction.commit();  
		entityManager.close();
		
	}


}
  