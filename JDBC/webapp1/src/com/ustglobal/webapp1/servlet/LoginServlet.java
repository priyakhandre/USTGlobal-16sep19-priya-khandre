package com.ustglobal.webapp1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.webapp1.dao.EmployeeDao;
import com.ustglobal.webapp1.dto.EmployeeInfo;
import com.ustglobal.webapp1.util.EmployeeDaoManager;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   int id = Integer.parseInt(req.getParameter("id"));
	   String password = req.getParameter("password");
	   String rememberMe = req.getParameter("rememeberme");
	   if(rememberMe==null) {
		   Cookie[] cookies = req.getCookies();
		   if(cookies!=null) {
		   for (Cookie cookie : cookies) {
			   if(cookie.getName().equals("alwaysRemember")) {
				   cookie.setMaxAge(0);
				   resp.addCookie(cookie);
			   }
			
		}
		   }
		   
	   }else {
		   Cookie cookie = new Cookie("alwaysRemember",id+"");
		   resp.addCookie(cookie);
	   }
	   EmployeeDao dao = EmployeeDaoManager.getEmployeeDao();
	   EmployeeInfo info =dao.auth(id, password);
	   
	  
	   if(info== null) {
		   PrintWriter out = resp.getWriter();
		   System.out.println("wrong password");
		   out.println("<html>");
		   out.println("<body>");
		   out.println("<h4 style= 'color:red'> invalid id or password</h4>");
		   
		   RequestDispatcher dispatcher = req.getRequestDispatcher("./login.jsp");
		   dispatcher.include(req, resp);
		   
		  
		   
		   
	   }else {
		   HttpSession session = req.getSession(true);    //which creates a session object inside servlet container which stores in hash table 
		   //which creates cookies called JSESSIONS and unique id 
		   //using this we can remove or delete an attribute
		   session.setAttribute("info", info);
		   RequestDispatcher dispatcher = req.getRequestDispatcher("/home");
		   dispatcher.forward(req, resp);
		   
	   }
		
		
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doPost(req, resp);
	}
	

}// end of LoginServlet
