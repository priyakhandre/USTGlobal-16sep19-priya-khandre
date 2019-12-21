package com.ustglobal.mailapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.mailapp.dto.MailBean;
import com.ustglobal.mailapp.dto.UserBean;

@Repository
public class UserDaoIMPL implements UserDAO {
   @PersistenceUnit
   private EntityManagerFactory factory;
   
	@Override
	public UserBean login(UserBean userBean) {
		EntityManager manager = factory.createEntityManager();
		String jpql="from UserBean where email=:email and password=:password";		
		try {
			TypedQuery<UserBean> query = manager.createQuery(jpql,UserBean.class);
			query.setParameter("email",userBean.getEmail());
			query.setParameter("password",userBean.getPassword());
		    UserBean bean = query.getSingleResult();
			return bean;
			}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public boolean deleteMail(int id) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		MailBean bean=manager.find(MailBean.class, id);
		if(bean!=null)
		{
			manager.remove(bean);
			tx.commit();
			return true;
		}
		return false;
	}
	
	@Override
	public boolean changePassword(UserBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			
		String jpql="from UserBean where email=:email";		
		TypedQuery<UserBean> query = manager.createQuery(jpql,UserBean.class);
		query.setParameter("email",bean.getEmail());
		UserBean bean1 = query.getSingleResult();
		bean1.setPassword(bean.getPassword());
		transaction.commit();
		return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}

   
	@Override
	public boolean registerUser(UserBean user) {
//MimeMessage message=sender.createMimeMessage();
		
		
		EntityManager em = factory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try {
			
//			MimeMessageHelper helper =new MimeMessageHelper(message, true);
//			helper.setTo(to);
//			helper.setSubject(subject);
//			helper.setText(body,true);
//			sender.send(message);
			et.begin();
			em.persist(user);
			et.commit();
			return true;
		} catch (Exception e) {
			et.rollback();
			e.printStackTrace();
			return false;
		}
		
	}
	@Override
	public List<MailBean> getAllMails() {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		String get = "from MailBean";
		Query query = manager.createQuery(get);
		
			List<MailBean> list = query.getResultList();
			if(list!=null) {
			return list;
	
		
		}else {
			return null;
		}
		
	}

}
