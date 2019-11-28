package com.ustglobal.Assignment2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.Assignment2.dto.Student;



public class ReadDemo {
	
		public static void main(String[] args) {
			EntityManagerFactory entityManagerFactory  = Persistence.createEntityManagerFactory("Test");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			Student stuDetail=entityManager.find(Student.class, 2);
			System.out.println("ID------" +stuDetail.getId());
			System.out.println("Name------"+ stuDetail.getName());
			System.out.println("Gender------" +stuDetail.getGender());
			entityManager.close();
		}
	}



