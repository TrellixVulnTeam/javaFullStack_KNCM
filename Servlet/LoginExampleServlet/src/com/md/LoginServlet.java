package com.md;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{

	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		
		try(PrintWriter out=response.getWriter()){
			
			String username= request.getParameter("username");
			String password=request.getParameter("password");
			
			//username and password validation
			if (username.equals("mahi") && password.equals("12345")) {
				
				// same name as the web.xml url-pattern reference
				RequestDispatcher rd=request.getRequestDispatcher("welcomeservlet");
				
				rd.forward(request, response);
				
			}else {
				out.println("sorry invalid uername and password");
				
				RequestDispatcher rd=request.getRequestDispatcher("/index.html");
				rd.include(request, response);
			
			}			
		}	
	}	
}
