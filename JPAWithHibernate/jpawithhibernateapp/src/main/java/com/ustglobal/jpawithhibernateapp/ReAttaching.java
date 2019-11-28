package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.product;

public class ReAttaching {
	public static void main(String[] args) {
		EntityManager entityManager =  null;
		EntityTransaction entityTransaction = null;
		try {
			
			EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction =entityManager.getTransaction();
			entityTransaction.begin();
			product prod1=entityManager.find(product.class, 103);
			System.out.println(entityManager.contains(prod1));
			entityManager.detach(prod1);
			System.out.println(entityManager.contains(prod1));
			product prod2=entityManager.merge(prod1);
			prod2.setPname("Car");
			
			System.out.println("record updated");
			entityTransaction.commit();
			
			
			
		}catch (Exception  e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
