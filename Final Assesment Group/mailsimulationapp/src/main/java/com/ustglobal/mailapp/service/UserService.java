package com.ustglobal.mailapp.service;

import java.util.List;

import com.ustglobal.mailapp.dto.MailBean;
import com.ustglobal.mailapp.dto.UserBean;

public interface UserService {
	public UserBean login(UserBean userBean);
	public boolean changePassword(UserBean bean);
	public boolean registerUser(UserBean user);
	public List<MailBean> getAllMails();
	public boolean deleteMail(int id);


}
