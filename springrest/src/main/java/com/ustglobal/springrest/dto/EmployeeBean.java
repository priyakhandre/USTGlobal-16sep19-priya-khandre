package com.ustglobal.springrest.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="employee")
public class EmployeeBean {
	@Id	
	@Column
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private String password;
	@Column
	private String gender;
	@Column
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date date;   /* no need of init binder coz we are not submitting the form
*/	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}



}
