package com.md;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletUrlRewriting2 extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		try(PrintWriter out=resp.getWriter()){
			
			String name=req.getParameter("name");
			out.println("Welcome, "+name);
			
			
			
		}
	}
	
	
	
	
}
