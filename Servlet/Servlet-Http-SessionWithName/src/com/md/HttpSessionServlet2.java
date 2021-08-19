package com.md;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class HttpSessionServlet2 extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		try(PrintWriter out=resp.getWriter()){
			
			
			HttpSession session=req.getSession(false);
			String name=(String) session.getAttribute("yourname");
			
			out.println("Welcome, "+name);
		}
		
		
	}
}
