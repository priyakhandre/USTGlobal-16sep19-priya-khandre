package com.ustglobal.mailapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.mailapp.dao.UserDAO;
import com.ustglobal.mailapp.dto.MailBean;
import com.ustglobal.mailapp.dto.UserBean;
@Service
public class UserServiceIMPL implements UserService {

	@Autowired
	private UserDAO dao;
	
	@Override
	public UserBean login(UserBean userBean) {
		
		return dao.login(userBean);
	}

	@Override
	public boolean changePassword(UserBean bean) {
		return dao.changePassword(bean);
	}
	
	@Override
	public boolean registerUser(UserBean user) {
		 
			
		return dao.registerUser(user); 
	}

	@Override
	public List<MailBean> getAllMails() {
	  return dao.getAllMails();
		
	}

	@Override
	public boolean deleteMail(int id) {
		return dao.deleteMail(id);
	}

}
