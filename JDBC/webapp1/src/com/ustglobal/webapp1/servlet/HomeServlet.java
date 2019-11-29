package com.ustglobal.webapp1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.webapp1.dto.EmployeeInfo;
 @WebServlet("/home")
public class HomeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false); //which checks session id present or not and valid or not
		if(session!= null) {
//			EmployeeInfo info = (EmployeeInfo)session.getAttribute("info");
//			PrintWriter out = resp.getWriter();
//			out.println("<h1> welcome " +info.getName());
//			out.println("</h1>");
//			
//			out.println("<a href = './search.html'>Search</a>");
//			out.println("<a href = './changepassword.html'>changepassword</a>");
//			out.println("<a href = './logout'>Logout</a>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("/home.jsp");
			dispatcher.forward(req, resp);
			
			
		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}

}
