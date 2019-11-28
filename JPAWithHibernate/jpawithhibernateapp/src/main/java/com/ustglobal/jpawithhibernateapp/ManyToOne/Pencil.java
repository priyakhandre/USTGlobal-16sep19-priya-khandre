package com.ustglobal.jpawithhibernateapp.ManyToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Table(name="Pencil")
@Entity
public class Pencil {
	@Id
	@Column
	private int pid;
	
	@Column
	private String color;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="bid" , nullable=false)
	private PencilBox pencilbox;

}
