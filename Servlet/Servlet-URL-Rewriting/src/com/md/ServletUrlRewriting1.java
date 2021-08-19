package com.md;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletUrlRewriting1 extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		try(PrintWriter out=response.getWriter()){
			
			String name=request.getParameter("name");
			
			out.println("Welcome, "+name);
			
			// append the username in the query string
			
			out.println("<h1><a href='ServletUrlRewriting2?name="+name+"'>Click me</a></h1>");
			
			
		}
	}
	
}
