package com.ustglobal.webapp1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.webapp1.dao.EmployeeDao;
import com.ustglobal.webapp1.dto.EmployeeInfo;
import com.ustglobal.webapp1.util.EmployeeDaoManager;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet  {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		EmployeeInfo info = new EmployeeInfo();
		info.setId(id);
		info.setName(name);
		info.setEmail(email);
		info.setPassword(password);
		
		EmployeeDao dao = EmployeeDaoManager.getEmployeeDao();
		boolean check = dao.registerEmployee(info);
		
		String msg = "";
		PrintWriter out = resp.getWriter();
		if(check ) {
			msg = "registration completed";
//			out.println("<html>");
//			out.println("<h4> Registration completed </h4>");
//			out.println("</html>");
			
			
		}else {
			msg = "id cannot be repeated";
//			out.println("<html>");
//			out.println("<h4> Id cannot be reapted </h4>");
//			out.println("</html>");
			
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("./login.jsp");
		dispatcher.forward(req, resp); // registration is completed then it will go to login page
	}

}
