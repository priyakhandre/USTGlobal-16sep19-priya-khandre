package com.ustglobal.mailapp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;



@Data
@Entity
@Table(name ="Mail_info")
public class MailBean {

	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private String subject;
	@Column
	private String message;
	@Column
	private String status; 
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "From_id",nullable = false)
	private UserBean userBeanFid;
   @JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="To_id", nullable = false)
	private UserBean userBeanTid;

}
