package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.ManyToOne.Pencil;
import com.ustglobal.jpawithhibernateapp.ManyToOne.PencilBox;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterId;

public class TestClass {

	public static void main(String[] args) {
		PencilBox pb = new PencilBox();
		pb.setBid(1);
		pb.setBname("Apsara");

		Pencil p = new Pencil();
		p.setPid(2);
		p.setColor("Black");
		p.setPencilbox(pb);
		
		Pencil p1 = new Pencil();
		p1.setPid(3);
		p1.setColor("red");
		p1.setPencilbox(pb);


		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		try {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Pencil pe=entityManager.find(Pencil.class,2);
			System.out.println(pe.getPencilbox().getBid());
			/*entityManager.persist(p);
			entityManager.persist(p1);*/
			System.out.println("record saved");
		    entityTransaction.commit(); 
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
	        entityManager.close();

	}
}
