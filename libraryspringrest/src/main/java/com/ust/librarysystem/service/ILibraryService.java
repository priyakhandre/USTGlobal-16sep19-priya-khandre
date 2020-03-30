package com.ust.librarysystem.service;

import java.util.Date;
import java.util.List;

import com.ust.librarysystem.dto.BookBean;
import com.ust.librarysystem.dto.BookIssue;
import com.ust.librarysystem.dto.LibrerianBean;
import com.ust.librarysystem.dto.StudentBean;

public interface ILibraryService {
	public StudentBean loginStudent(String id,String password);
	public LibrerianBean loginLibrerian(String id,String password);
	public boolean registerStudent(StudentBean bean);
	public boolean registerLibrerian(LibrerianBean bean);
	public BookBean searchBook(int id);
	public boolean addBook(BookBean bean);
	public boolean updatebook(int id,String bname,String bauthor,String publication);
	public boolean deletebook(int id);
	public boolean request(String sid, int id);
	public boolean respond(int id);
	public boolean deleteRespond(int bid);
	public List<BookIssue> getResponse();
}
