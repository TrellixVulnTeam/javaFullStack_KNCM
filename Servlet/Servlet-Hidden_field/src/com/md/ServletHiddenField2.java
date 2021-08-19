package com.md;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletHiddenField2 extends HttpServlet{
	
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		
		try(PrintWriter out=response.getWriter()){
			
			String name=request.getParameter("yourname");
			
			out.println("Hello, "+name);
			
			
			
		}
		
	}

}
