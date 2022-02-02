package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.to.Product;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegisterServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      Product product =(Product) request.getAttribute("product");
      PrintWriter out = response.getWriter();
      out.print("<h1> <font color='blue'>The details that you enetered are :</font> </h1>");
      out.println("<h2>"+ product+"</h2>");
	}

}
