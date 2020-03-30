package com.ust.librarysystem.service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.librarysystem.dao.ILibraryDAO;
import com.ust.librarysystem.dto.BookBean;
import com.ust.librarysystem.dto.BookIssue;
import com.ust.librarysystem.dto.LibrerianBean;
import com.ust.librarysystem.dto.StudentBean;
@Service
public class LibraryService implements ILibraryService{
	
	@Autowired
	private ILibraryDAO dao;
	@Override
	public StudentBean loginStudent(String id, String password) {
		// TODO Auto-generated method stub
		return dao.loginStudent(id, password);
	}

	@Override
	public LibrerianBean loginLibrerian(String id, String password) {
		// TODO Auto-generated method stub
		
		return dao.loginLibrerian(id, password);
	}

	@Override
	public boolean registerStudent(StudentBean bean) {
		// TODO Auto-generated method stub
		if(bean.getPassword().length()>=8) {
			return dao.registerStudent(bean);
		}
		return false;
	}

	@Override
	public boolean registerLibrerian(LibrerianBean bean) {
		// TODO Auto-generated method stub
		if(bean.getPassword().length()>=8) {
			return dao.registerLibrerian(bean);
		}
		return false;
	}

	@Override
	public BookBean searchBook(int id) {
		// TODO Auto-generated method stub
		return dao.searchBook(id);
	}

	@Override
	public boolean addBook(BookBean bean) {
		// TODO Auto-generated method stub
		return dao.addBook(bean);
	}

	@Override
	public boolean updatebook(int id,String bname,String bauthor,String publication) {
		// TODO Auto-generated method stub
		return dao.updatebook(id,bname,bauthor,publication);
	}

	@Override
	public boolean deletebook(int id) {
		// TODO Auto-generated method stub
		return dao.deletebook(id);
	}

	@Override
	public boolean request(String sid, int id) {
		// TODO Auto-generated method stub
		return dao.request(sid, id);
	}

	@Override
	public boolean respond(int bid) {
		// TODO Auto-generated method stub
		return dao.respond(bid);
	}
	
	public Date returnDate() {
		Date d = new Date();
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(d);
		cal.add(Calendar.DATE,10);
		return cal.getTime();
	}

	@Override
	public List<BookIssue> getResponse() {
		// TODO Auto-generated method stub
		return dao.getResponse();
	}

	@Override
	public boolean deleteRespond(int bid) {
		// TODO Auto-generated method stub
		return dao.deleteRespond(bid);
	}
}
