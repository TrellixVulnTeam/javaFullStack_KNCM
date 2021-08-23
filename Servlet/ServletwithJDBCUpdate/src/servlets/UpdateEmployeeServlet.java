package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.md.Employee;
import com.md.EmployeeDao;
import com.md.EmployeeDaoFactory;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/updateEmployee")
public class UpdateEmployeeServlet extends HttpServlet{
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		try(PrintWriter out=response.getWriter()){
			
			request.getRequestDispatcher("/navbar.html").include(request, response);;
			out.println("<br>");
			
			int id=Integer.valueOf(request.getParameter("id"));
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String gender=request.getParameter("gender");
			String country=request.getParameter("country");
			
			
			Employee employee=new Employee();
			
			employee.setId(id);
			employee.setName(name);
			employee.setEmail(email);
			employee.setGender(gender);
			employee.setCountry(country);
			
			EmployeeDao dao=EmployeeDaoFactory.getEmployeeDao();
			dao.updateEmployee(employee);
			out.println("Employee have successfully Updated");
			out.println("<br>");
			out.println("<h1>Id: "+id+", Name: "+name+", Email: "+email+", Gender: "+gender+", Country:"+country+"</h1>");
			out.println(employee);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
