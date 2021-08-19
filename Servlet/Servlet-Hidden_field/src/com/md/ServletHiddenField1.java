package com.md;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletHiddenField1 extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		
		try(PrintWriter out =response.getWriter()){
			
			// here which field you want to request
			// from the index.html file
			
			String name=request.getParameter("name");
			out.println("Welcome, "+name);
			out.println("<form action='ServletHiddenField2'>");
			// this is how we call hidden field
			out.println("<input type='hidden' name='yourname' value='"+name+"'/>");
			out.println("<input type='submit' value='send'/>");
			out.println("</form>");
			
			
			
		}
		
	}
	
	
	
}
