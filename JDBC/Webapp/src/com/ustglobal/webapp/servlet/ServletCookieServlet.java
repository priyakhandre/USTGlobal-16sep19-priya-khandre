package com.ustglobal.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCookieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] Cookies=req.getCookies();
		PrintWriter out = resp.getWriter();
		if(Cookies== null) {
			out.println("<h1> no cookie found </h1>");
		}else {
			for (Cookie cookie : Cookies) {
				String name = cookie.getName();
				if(name.equals("emp-name")) {
					cookie.setMaxAge(0);
				}
					out.println("<h1> cookie deleted ");
					
				}
	}
	}
}

