package com.ustglobal.mailapp.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;



@Data
@Entity
@Table(name ="User_info")
public class UserBean {
    @Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private String user_name;
	@Column
	private String email;
	@Column
	private String password;

	@JsonIgnore
	@Exclude
	@OneToMany(mappedBy = "userBeanFid")
	private List<MailBean> mailBeans;

}



