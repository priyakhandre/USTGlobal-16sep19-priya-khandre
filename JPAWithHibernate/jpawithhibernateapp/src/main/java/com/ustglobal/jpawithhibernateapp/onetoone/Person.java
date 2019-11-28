package com.ustglobal.jpawithhibernateapp.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Person")

public class Person {
	@Id
	@Column
	private int pid;
	@Column
	private String pname;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="vid")
	private VoterId voterid;
	 
	
   
	
	

}
