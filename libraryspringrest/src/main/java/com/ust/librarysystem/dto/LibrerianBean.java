package com.ust.librarysystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class LibrerianBean {
	@Id
	@Column
	private String libid;
	@Column
	private String name;
	@Column
	private String password;
	@Column
	private String gender;
	

}
