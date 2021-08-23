package com.md;

public class EmployeeDaoFactory {

	private static EmployeeDao dao;
	
	private EmployeeDaoFactory() {}
	
	public static EmployeeDao getEmployeeDao() throws ClassNotFoundException {
		if(dao==null) {
			dao=new EmployeeDaoImpl();
		}
		
		return dao;
		
	}
	
}
