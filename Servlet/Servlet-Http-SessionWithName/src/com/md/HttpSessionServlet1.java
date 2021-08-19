package com.md;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class HttpSessionServlet1 extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		try(PrintWriter out=resp.getWriter()){
			
			String name=req.getParameter("name");
			out.println("Welcome, "+name);
			
			HttpSession session=req.getSession();
			session.setAttribute("yourname", name);
			
			out.println("<h1><a href='HttpSessionServlet2'>Click here</a></h1>");
		}
		
	}
}
