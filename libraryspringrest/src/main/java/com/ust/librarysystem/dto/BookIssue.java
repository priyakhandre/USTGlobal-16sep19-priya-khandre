package com.ust.librarysystem.dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table
public class BookIssue {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
//	@JsonBackReference
//	@JsonFormat(pattern="yyyy-MM-dd")
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name =  "rollno" ,nullable = false)
	private StudentBean student;
//	@JsonBackReference
//	@JsonFormat(pattern="yyyy-MM-dd")
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "bid",nullable = false)
	private BookBean book;	
	@Column
	private Date issueDate;
	@Column 
	private Date returnDate;
	@Column 
	private String status;
}
