package com.vishwanath.learning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
	  response.setContentType("text/html");
	  
	  PrintWriter out = response.getWriter();
	  
//	  Invalidate the session here
	  request.getSession().invalidate();
	  
//	  creating link for login again after logout
	  out.println("You are now logged out...<br>");
	  out.println("<a href='index.html'>Login again</a>");
	}
}
