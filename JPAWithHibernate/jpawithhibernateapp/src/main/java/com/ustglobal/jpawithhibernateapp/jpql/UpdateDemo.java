package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.product;



public class UpdateDemo {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		  entityManager = entityManagerFactory.createEntityManager();
		 entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		String jpql = "update product set pname='xyz' where pid=102 ";
		Query query = entityManager.createQuery(jpql);
		int resquery= query.executeUpdate();
		
			
			System.out.println(resquery);
			entityTransaction.commit();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}finally {
			entityManager.close();
		}
	}
}


