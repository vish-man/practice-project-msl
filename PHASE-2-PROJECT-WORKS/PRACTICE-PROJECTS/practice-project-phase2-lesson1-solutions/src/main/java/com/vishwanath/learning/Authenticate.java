package com.vishwanath.learning;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/authenticate")
public class Authenticate extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	    Set the content type
		response.setContentType("text/html");
		
//		Get the parameter values
		String userName = request.getParameter("userName");
		String userPassword = request.getParameter("userPassword");
		
//		Check for authenticity
		if(userName.trim().equals("admin")&&userPassword.trim().equals("admin@123")) {
			
//		Get the requestDispatcher object
		RequestDispatcher dispatcher= request.getRequestDispatcher("dashboard");
		
//		Forward the request
		dispatcher.forward(request, response);
		}
		else {
			response.getWriter().println("Invalid username or password!!, try again...");
			
//			Get the requestDispatcher object
			RequestDispatcher dispatcher= request.getRequestDispatcher("/index.html");

//			Forward the request
//			dispatcher.forward(request, response);
			dispatcher.include(request, response);

		}
	}

}
