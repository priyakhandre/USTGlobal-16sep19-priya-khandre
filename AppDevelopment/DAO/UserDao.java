package com.ustglobal.AppDevelopment.DAO;

import java.util.List;

import com.ustglobal.AppDevelopment.DTO.UserBean;

public interface UserDao {
	
	public List<UserBean>showAllContatcts();
	public UserBean searchContact(String name);
	public int operateContact(UserBean bean);
	public int insertUserData(UserBean bean2);
	
	

}
