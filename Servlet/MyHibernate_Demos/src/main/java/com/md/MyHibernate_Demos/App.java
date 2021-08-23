package com.md.MyHibernate_Demos;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Hibernate started...");
    	
    	Configuration cfg=new Configuration();
    	
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session=factory.openSession();
    	
    	Transaction transaction=session.beginTransaction();
    	
    	
    	Employee employee=new Employee();
    	
    	employee.setId(6);
    	employee.setName("mahi");
    	employee.setEmail("m@revature.net");
		
    	
    	// 2nd table will inserting
    	Address address=new Address();
    	
    	address.setCity("NYC");
    	address.setStreet("Kingston place");
    	address.setEntry(new Date());
    	address.setOpen(true);
    	address.setX(20.25);
    	
    	//session.save(employee);

    	//session.save(address);
    	
    	
    	//getting the data from database
    	// GET() will not give you error if there is not
    	// data in your table
    	
    	address=session.get(Address.class, 1);
    	System.out.println(address);
    	
    	address=session.get(Address.class, 10);
    	System.out.println(address);

    	// LOAD() will give you error if there is no data in
    	// your table, but it will not give you error
    	// if you not called it
    	address=session.load(Address.class, 10);
    	//System.out.println(address);

    	
    	
    	
    	transaction.commit();
    	session.close();
    	
    	
    	
//        System.out.println(factory);
//        
//        System.out.println(factory.isClosed());
    }
}
