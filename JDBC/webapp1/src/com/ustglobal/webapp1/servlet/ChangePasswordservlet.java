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

import com.ustglobal.webapp1.dao.EmployeeDao;
import com.ustglobal.webapp1.dto.EmployeeInfo;
import com.ustglobal.webapp1.util.EmployeeDaoManager;


@WebServlet("/changepassword")
public class ChangePasswordservlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    HttpSession session = req.getSession(false);
	    if(session!=null) {
	    	String pass = req.getParameter("password");
	    	String confirmpass = req.getParameter("confirmpassword");
	    	
	    	if(pass.equals(confirmpass)) {
	    		EmployeeInfo info = (EmployeeInfo)session.getAttribute("info");
	    	EmployeeDao dao = EmployeeDaoManager.getEmployeeDao();
	    	dao.changePassword(info.getId(), pass);
	    	RequestDispatcher dispatcher = req.getRequestDispatcher("/home");
	    	dispatcher.forward(req, resp);
	    	}else {
	    		String msg = "password not Matching ";
	    		req.setAttribute("msg", msg);
	    		PrintWriter out = resp.getWriter();
//	    		out.println("<html>");
//	    		out.println("<h4> password not Matching </h4>");
//	    		out.println("<html>");
//	    		
//	    		RequestDispatcher dispatcher =req.getRequestDispatcher("/changepassword.html");
//	    		dispatcher.include(req, resp);
	    		RequestDispatcher dispatcher =req.getRequestDispatcher("/changepassword.jsp");
	    		dispatcher.forward(req, resp);
//	    		
	    		
	    	}
	    	
	    }else {
	    	RequestDispatcher dispatcher = req.getRequestDispatcher("./login.html");
	    	dispatcher.forward(req, resp);
	    }
		
		
		
	}

}
