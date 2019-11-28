package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.product;

public class GetReference {
	public static void main(String[] args) {
		EntityTransaction entityTransaction = null;
        EntityManager entityManager = null;
        try {
        
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		 
		product prod1 = entityManager.getReference(product.class, 101);
//		product prod1 = entityManager.find(product.class, 102);
		
		System.out.println(prod1.getPid());
		System.out.println(prod1.getPname());
		System.out.println(prod1.getQuantity());
		
		
		
	}catch (Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
        entityManager.close();

}
		
	}


