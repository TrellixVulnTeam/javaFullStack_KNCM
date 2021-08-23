package com.md;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{

    Connection connection = null;
    private static Statement statement = null;

    public EmployeeDaoImpl() throws ClassNotFoundException {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
	

	@Override
	public void addEmployee(Employee employee) throws SQLException {
		
		String sql="insert into add_emp(name,email,gender,country) values(?,?,?,?)";
		PreparedStatement ps=connection.prepareStatement(sql);
		
		ps.setString(1, employee.getName());
		ps.setString(2, employee.getEmail());
		ps.setString(3, employee.getGender());
		ps.setString(4, employee.getCountry());

		int count=ps.executeUpdate();
		
		if(count>0) {
			System.out.println("Employee added");
		}else {
			System.out.println("Something went wrong");
		}
	}


	@Override
	public void updateEmployee(Employee employee) throws SQLException {
		String sql="update add_emp set name=?,email=?, gender=?,country=? where id=?";
		PreparedStatement ps=connection.prepareStatement(sql);
		
		ps.setString(1, employee.getName());
		ps.setString(2, employee.getEmail());
		ps.setString(3, employee.getGender());
		ps.setString(4, employee.getCountry());
		ps.setInt(5, employee.getId());

		int count=ps.executeUpdate();
		
		if(count>0) {
			System.out.println("Employee Updated");
		}else {
			System.out.println("Something went wrong");
		}
	}


	@Override
	public void deleteEmployee(int id) throws SQLException {

        String sql = "delete from add_emp where id=?";
        PreparedStatement ps=connection.prepareStatement(sql);
		
		ps.setInt(1, id);
		
		int count=ps.executeUpdate();
		
		if(count>0) {
			System.out.println("Employee deleted");
		}else {
			System.out.println("Something went wrong");
		}
		
	}

	@Override
	public List<Employee> getAllEmployee() throws SQLException {
		
		List<Employee> employees = new ArrayList();
		
		String sql = "select * from add_emp";
        statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
		
        while(rs.next()) {
			
			Employee employee=new Employee();
			
			employee.setName(rs.getString(1));
			employee.setEmail(rs.getString(2));
			employee.setGender(rs.getString(3));
			employee.setCountry(rs.getString(4));
			employee.setId(rs.getInt(5));

			//adding to the ArrayList
			employees.add(employee);
			// print all employee from the table
			//System.out.println(employee);
			
			
		}
        
		return employees;
	}


	@Override
	public Employee findById(int id) throws SQLException {

		String sql = "select * from add_emp where id=?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet rs = preparedStatement.executeQuery();

		Employee e=null;
		
		while(rs.next()) {
			
			  String name=rs.getString(1);
			  String email =rs.getString(2);
			  String gender= rs.getString(3);
			  String country= rs.getString(4);
			  //int id2= rs.getInt(5);
			  
			 e=new Employee(name,email,gender,country,id);
		}
        
		if (e==null) {
			System.out.println("Please provide right employee id.");
		}else {
			System.out.println(e+"\n");
		}
        
        
		return e;
	}

}
