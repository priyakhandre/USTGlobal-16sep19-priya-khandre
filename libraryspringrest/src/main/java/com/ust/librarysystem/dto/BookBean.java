package com.ust.librarysystem.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import lombok.ToString.Exclude;
import lombok.ToString.Include;

@Data
@Entity
@Table
public class BookBean {
	
	@Id
	@Column
	@GeneratedValue
	private int bid;
	@Column
	private String bname;
	@Column
	private String bauthor;
	@Column
	private String publication;
	@JsonBackReference
	@Exclude
	@OneToMany(mappedBy = "book")
	private List<BookIssue> bookIssue;
}
