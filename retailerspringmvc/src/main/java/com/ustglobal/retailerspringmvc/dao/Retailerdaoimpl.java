package com.ustglobal.retailerspringmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.retailerspringmvc.bean.OrderProduct;
import com.ustglobal.retailerspringmvc.bean.Product;
import com.ustglobal.retailerspringmvc.bean.User;


@Repository
public class Retailerdaoimpl implements Retailerdao {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public User login(String email, String password) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		String jpql="from User where email=:email and password=:password";
		TypedQuery<User> tquery=manager.createQuery(jpql, User.class);
		tquery.setParameter("email", email);
		tquery.setParameter("password", password);
		try {
			User user=tquery.getSingleResult();
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean register(User user) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Product search(String pname) {
		EntityManager manager=factory.createEntityManager();
		try {
			Product product=manager.find(Product.class, pname);
			return product;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean updatePassword(String email, String password) {
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		try {
			User user=entityManager.find(User.class, email);
			user.setPassword(password);
			System.out.println("update");
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<OrderProduct> getProducts(String email) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
			String jpql="from OrderProduct where email=:email";
			TypedQuery<OrderProduct> tquery=manager.createQuery(jpql,OrderProduct.class);
			tquery.setParameter("email", email);
			List<OrderProduct> list=tquery.getResultList();
			return list;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean buyProduct(OrderProduct orderProduct) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(orderProduct);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}	}
}
	
	