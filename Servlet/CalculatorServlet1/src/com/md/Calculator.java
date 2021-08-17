package com.md;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet{

	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<h1>Welcome to my Calculator App</h1>");

		double firstNum=Double.parseDouble(request.getParameter("first_num"));
		double secondNum=Double.parseDouble(request.getParameter("second_num"));
		
		String operator=request.getParameter("operator");
		//String operator=request.getParameter("user_operation");

		double result=0;
		
		if (operator.equals("+")) {
			result=firstNum+secondNum;
			out.println("Addition success");
			
		}
		if (operator.equals("-")) {
			result=firstNum-secondNum;
			out.println("Subtraction  success");	
		}
		if (operator.equals("*")) {
			result=firstNum*secondNum;
			out.println("Multiplication success");	
		}
		if (operator.equals("/")) {
			result=firstNum/secondNum;
			out.println("Division  success");	
		}
		
		out.println("<h1>Result: "+ result+"</h1>");

		
		
		
	}
	
	
	
}
