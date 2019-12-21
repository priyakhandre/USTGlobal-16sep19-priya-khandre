package com.ustglobal.mailapp.dao;

import java.util.List;

import com.ustglobal.mailapp.dto.MailBean;
import com.ustglobal.mailapp.dto.UserBean;

public interface UserDAO {
	public UserBean login(UserBean userBean);
	public boolean deleteMail(int id);
	public boolean changePassword(UserBean bean);
	public boolean registerUser(UserBean user);
	public List<MailBean> getAllMails();

}
