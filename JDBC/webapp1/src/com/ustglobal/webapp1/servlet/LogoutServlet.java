package com.ustglobal.webapp1.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session !=null) {
			session.invalidate();   //destroy the object present present in cookie ..
			
			
			}
		RequestDispatcher dispatcher = req.getRequestDispatcher("./login.html");
		dispatcher.forward(req, resp);
		
	}
	

}
