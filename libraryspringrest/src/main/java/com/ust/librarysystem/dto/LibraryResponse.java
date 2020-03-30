package com.ust.librarysystem.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class LibraryResponse {
	private int statusCode;
	private String message;
	private String description;
	private String session;
	private List<StudentBean> stud;
	private List<LibrerianBean> lib;
	private List<BookIssue> issue;
	private BookBean book;
	
}
