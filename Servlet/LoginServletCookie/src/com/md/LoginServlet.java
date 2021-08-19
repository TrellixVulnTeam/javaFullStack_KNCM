package com.md;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	response.setContentType("text/html");	
	
	try(PrintWriter out=response.getWriter()){
		
		request.getRequestDispatcher("navbar.html").include(request, response);
		out.println("<br>");
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		if (username.equals("mahi") && password.equals("12345")) {
			
			out.println("<h4>You're logged in</h4>");
			out.println("<h1></br>Welcome, "+username +" </h1>");
			
			// if username and password are valid then user cookies
			
			Cookie cookie=new Cookie("username",username);
			
			response.addCookie(cookie);
			
		}else {
			out.println("Sorry !! invalid username and password");
			
			RequestDispatcher rd=request.getRequestDispatcher("/login.html");
			
			rd.include(request, response);
			
			}				
		
		}
	}
}
