package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.product;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory  = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		product prodDetail=entityManager.find(product.class, 101);
		System.out.println("ID------" +prodDetail.getPid());
		System.out.println("Name------"+ prodDetail.getPname());
		System.out.println("Quantity------" +prodDetail.getQuantity());
		entityManager.close();
	}

}
