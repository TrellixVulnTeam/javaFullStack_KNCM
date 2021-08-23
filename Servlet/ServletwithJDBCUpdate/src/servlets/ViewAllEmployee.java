package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import com.md.Employee;
import com.md.EmployeeDao;
import com.md.EmployeeDaoFactory;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ViewAllEmployee extends HttpServlet{


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		try(PrintWriter out=response.getWriter()){
			
			request.getRequestDispatcher("/navbar.html").include(request, response);;
			out.println("<br>");
			
			
			EmployeeDao dao=EmployeeDaoFactory.getEmployeeDao();
			List<Employee> employees=dao.getAllEmployee();
			
			out.println("<!DOCTYPE html>");
			out.println("<HTML>");
			out.println("<Head>");
			out.println("<Title>Employee List</Title>");
			out.println("</Head>");
			out.println("<Body>");
			out.println("<h1>Employee List</h1>");
			out.println("<table border=1 width=50% height=50%>"); 
			out.println("<tr><th>Id</th>");
			out.println("<th>Name</th>");
			out.println("<th>Email</th>");
			out.println("<th>Gender</th>");
			out.println("<th>Country</th>");
			out.println("<th>Actions</th></tr>");
			
						
			 for(Employee employee:employees) {
				 
				 int id=employee.getId();
				 String name=employee.getName();
				 String email=employee.getEmail();
				 String gender=employee.getGender();
				 String country=employee.getCountry();

				 
				 out.println("<tr><td>"+id+"</td>");
				 out.println("<td>"+name+"</td>");
				 out.println("<td>"+email+"</td>");
				 out.println("<td>"+gender+"</td>");
				 out.println("<td>"+country+"</td>");
					//out.println("<h1><a href='ServletUrlRewriting2?name="+name+"'>Click me</a></h1>");

				 out.println("<td><a href='update.html?id="+id+"'>edit</a></td>");
				 out.println("<td><a href='delete.html?id="+id+"'>delete</a></td></tr>");

				 
				 //out.println("<td><a href='update?id' value='${}'>edit</a></td>");
				 
				 
			 }
			 
			 
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");


			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	}
	

	
