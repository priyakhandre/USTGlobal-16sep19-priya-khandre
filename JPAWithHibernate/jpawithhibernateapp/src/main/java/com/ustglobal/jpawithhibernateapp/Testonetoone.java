package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetoone.Person;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterId;

public class Testonetoone {
	public static void main(String[] args) {
		VoterId vi = new VoterId();
		vi.setVid(10);
		vi.setVname("priya");
		Person p = new Person();
		p.setPid(101);
		p.setPname("priya");
		p.setVoterid(vi);
		EntityTransaction entityTransaction = null;
        EntityManager entityManager = null;
        try {
        
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		VoterId vcard=entityManager.find(VoterId.class,10);
		System.out.println(vcard.getPerson().getPid());
		
		
		//entityManager.persist(p);
		System.out.println("record saved");
	    entityTransaction.commit(); 
	
	}catch (Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
        entityManager.close();

}
}
