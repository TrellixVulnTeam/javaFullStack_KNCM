package com.md;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NameTestSendRedirect extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		try(PrintWriter out=response.getWriter()){
			
			String name=request.getParameter("name");
			response.sendRedirect("http://www.google.com?name="+name);
			
			
		}
		
	}
	
}
