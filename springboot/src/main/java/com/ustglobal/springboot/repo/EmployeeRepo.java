package com.ustglobal.springboot.repo;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.ustglobal.springboot.dto.EmployeeBean;

public interface EmployeeRepo extends JpaRepository<EmployeeBean,Integer> {
	
	/*public boolean findByName(String name);*/ //it search employee detail using searching by name
	@Transactional
	@Modifying
	@Query("update EmployeeBean set name=:name,password=:password,doj=:doj where id=:id")
	public void update(String name ,String password ,Date doj ,String gender ,int id);

}
