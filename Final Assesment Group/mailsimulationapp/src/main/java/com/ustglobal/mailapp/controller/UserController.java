package com.ustglobal.mailapp.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.mailapp.dto.MailBean;
import com.ustglobal.mailapp.dto.UserBean;
import com.ustglobal.mailapp.dto.UserResponse;
import com.ustglobal.mailapp.service.UserService;

@CrossOrigin(origins="*",allowedHeaders="*",allowCredentials="true")
@RestController
public class UserController {
	@Autowired
	private UserService service;

	//	 private UserResponse response ;
	@PostMapping(path = "/login",consumes =MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE )
	public UserResponse login(@RequestBody UserBean bean) {
		UserResponse response = new UserResponse();

		if(service.login(bean) != null) {
			response.setStatusCode(200);
			response.setMessage("success");
			response.setDescription("user exist");
		}else {
			response.setStatusCode(400);
			response.setMessage("failure");
			response.setDescription("not exist");
		}
		return response;
	}

	@PostMapping(path = "/change-password",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse changePassword(@RequestBody UserBean bean) {
		UserResponse response = new UserResponse();
		boolean check = service.changePassword(bean);

		if(check) {
			response.setStatusCode(200);
			response.setMessage("success");
			response.setDescription("password changed sucessfully");
		}
		else {
			response.setStatusCode(400);
			response.setMessage("failure");
			response.setDescription("password can't change");
		}
		return response;
	}


	@PostMapping(path="/register",produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE)

	public UserResponse registerUser(@RequestBody UserBean user) {
		UserResponse response = new UserResponse();

		if(service.registerUser(user)) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("User is added successfully");
			return response;
		}else {
			response.setStatusCode(400);
			response.setMessage("Failure");
			response.setDescription("User is not added");
			return response;
		}
	}

	@DeleteMapping(path="/delete/{id}" ,produces=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse deleteMail(@PathVariable("id") int id) {
		UserResponse response=new UserResponse();
		if(service.deleteMail(id)) {
			response.setStatusCode(200);
			response.setMessage("success");
			response.setDescription("data deleted successfully ");

			return response;

		}
		else {
			response.setStatusCode(400);
			response.setMessage("failure");
			response.setDescription("data not deleted successfully ");

			return response;
		}
	}
	@GetMapping(path="/allmail",produces=MediaType.APPLICATION_JSON_VALUE)
	//	@ResponseBody
	public UserResponse getAllMails(HttpServletRequest request){
		UserResponse response = new UserResponse();


		List<MailBean> mailBean = service.getAllMails();
		if(mailBean!=null) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("All Mails List");
			response.setMailBean(mailBean);
			return response;
		}else {
			response.setStatusCode(400);
			response.setMessage("Failure");
			response.setDescription("Error Occured");
			return response;
		}

	}
}
