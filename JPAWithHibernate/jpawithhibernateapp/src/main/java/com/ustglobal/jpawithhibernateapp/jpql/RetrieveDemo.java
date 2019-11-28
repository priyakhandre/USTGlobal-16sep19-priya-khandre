package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.product;

public class RetrieveDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from product";
		Query query = entityManager.createQuery(jpql);
		List<product> l1=query.getResultList();
		for (product object : l1) {
			System.out.println(object.getPid());
			System.out.println(object.getPname());
			System.out.println(object.getQuantity());
			
		}
		entityManager.close();
	}

}
