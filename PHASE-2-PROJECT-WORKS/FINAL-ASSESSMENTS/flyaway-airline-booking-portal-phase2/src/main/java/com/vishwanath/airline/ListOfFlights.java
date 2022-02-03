package com.vishwanath.airline;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vishwanath.flyaway.ConnectionUtil;

@WebServlet("/FlightList")
public class ListOfFlights extends HttpServlet {
private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
String from=request.getParameter("from");
String to=request.getParameter("to");
String departure=request.getParameter("departure");
try {
ConnectionUtil dao = new ConnectionUtil();
java.util.List<String[]> flights=dao.getAvailableFlights(from, to, departure);
HttpSession session=request.getSession();
session.setAttribute("flights", flights);
} catch (ClassNotFoundException | SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
response.sendRedirect("FlightList.jsp");
}
}