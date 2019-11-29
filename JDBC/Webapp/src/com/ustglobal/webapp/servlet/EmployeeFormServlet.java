package com.ustglobal.webapp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeFormServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int search = Integer.parseInt(req.getParameter("id"));
		resp.sendRedirect("jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root" +search);
		
	}

}
