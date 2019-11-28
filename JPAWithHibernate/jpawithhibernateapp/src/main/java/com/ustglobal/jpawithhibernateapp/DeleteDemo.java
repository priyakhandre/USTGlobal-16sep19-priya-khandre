package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.product;

public class DeleteDemo {
	public static void main(String[] args) {
        EntityTransaction entityTransaction = null;
        EntityManager entityManager = null;
        try {
        
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		product prod1 = entityManager.find(product.class, 101);
		entityManager.remove(prod1);
		System.out.println("record remove");
		entityTransaction.commit();
		
	}catch (Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
        entityManager.close();

}
}
