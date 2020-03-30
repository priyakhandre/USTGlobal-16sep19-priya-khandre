package com.ust.librarysystem.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ust.librarysystem.dto.BookBean;
import com.ust.librarysystem.dto.BookIssue;
import com.ust.librarysystem.dto.LibrerianBean;
import com.ust.librarysystem.dto.StudentBean;
import com.ust.librarysystem.service.LibraryService;

@Repository
public class LibraryDAOImpl implements ILibraryDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;
	@Autowired
	private LibraryService service;
	@Override
	public StudentBean loginStudent(String id, String password) {
		String jpql = "from StudentBean where id=:id and password=:password";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<StudentBean> query = manager.createQuery(jpql, StudentBean.class);
		query.setParameter("id", id);
		query.setParameter("password", password);
		try {
			StudentBean bean = query.getSingleResult();
			return bean;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}
	@Override
	public LibrerianBean loginLibrerian(String id, String password) {
		String jpql = "from LibrerianBean where id=:id and password=:password";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<LibrerianBean> query = manager.createQuery(jpql, LibrerianBean.class);
		query.setParameter("id", id);
		query.setParameter("password", password);
		try {
			LibrerianBean bean = query.getSingleResult();
			return bean;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public boolean registerStudent(StudentBean bean) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		try {
			transaction.begin();
			manager.persist(bean);
			
			transaction.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;			
		}
	}
	
	@Override
	public boolean registerLibrerian(LibrerianBean bean) {
		// TODO Auto-generated method stub
 		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		try {
			transaction.begin();
			manager.persist(bean);
			
			transaction.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;			
		}
	}
	@Override
	public BookBean searchBook(int id) {
		EntityManager manager  = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			BookBean bean = manager.find(BookBean.class, id);
			transaction.commit();
			return bean;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public boolean addBook(BookBean bean) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;			
		}
	}
	@Override
	public boolean updatebook(int id,String bname,String bauthor,String publication) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			BookBean book = manager.find(BookBean.class, id);
			book.setBname(bname);
			book.setBauthor(bauthor);
			book.setPublication(publication);
			transaction.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public boolean deletebook(int id) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			BookBean bean = manager.find(BookBean.class, id);
			manager.remove(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public boolean request(String sid, int bid) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Date d = new Date();
			BookBean book = manager.find(BookBean.class, bid);
			StudentBean student = manager.find(StudentBean.class, sid);
			BookIssue issue = new BookIssue();
			issue.setStudent(student);
			issue.setBook(book);
			issue.setIssueDate(d);
			issue.setStatus("request");
			manager.persist(issue); 	
			transaction.commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public boolean respond(int bid) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			BookIssue issue =  manager.find(BookIssue.class, bid);
			issue.setReturnDate(service.returnDate());
			issue.setStatus("accept");
			manager.persist(issue);
			transaction.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean deleteRespond(int bid) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			BookIssue issue =  manager.find(BookIssue.class, bid);
			manager.remove(issue);
			transaction.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public List<BookIssue> getResponse() {
		// TODO Auto-generated method stub
		String jpql = "from BookIssue";
		EntityManager manager = factory.createEntityManager();
		try {
			TypedQuery<BookIssue> book = manager.createQuery(jpql, BookIssue.class);
			List<BookIssue> lbook = book.getResultList();
			return lbook;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
