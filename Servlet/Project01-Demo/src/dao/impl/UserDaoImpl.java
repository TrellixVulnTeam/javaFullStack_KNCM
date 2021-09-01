package dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.md.User;

import util.HibernateUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public void addEmployee(User user) {
		Transaction transaction=null;
		
		try(Session session=HibernateUtil.getSesssionFactory().openSession()){
			
			transaction=session.beginTransaction();
			
			session.save(user);
			
			transaction.commit();
			
			if (transaction!=null) {
				transaction.rollback();
			}
			
		}
		
	}
	
	@Override
	public void updateEmployee(User user) {
		Transaction transaction=null;
		
		try(Session session=HibernateUtil.getSesssionFactory().openSession()){
			
			transaction=session.beginTransaction();
			
			session.update(user);
			
			transaction.commit();
			
			if (transaction!=null) {
				transaction.rollback();
			}
			
		}
		
	}
	
	@Override
	public void deleteEmployee(int  userId) {
		Transaction transaction=null;
		
		try(Session session=HibernateUtil.getSesssionFactory().openSession()){
			
			transaction=session.beginTransaction();
			
			User user=session.get(User.class, userId);
			
			if (user!=null) {
				session.delete(user);
				System.out.println("Employee deleted!!!");
			}
			
			transaction.commit();
			
			if (transaction!=null) {
				transaction.rollback();
			}
			
		}
		
	}
	
	
	@Override
	public User findEmployeeById(int  userId) {
		Transaction transaction=null;
		User user=null;
		try(Session session=HibernateUtil.getSesssionFactory().openSession()){
			
			transaction=session.beginTransaction();
			
			 user=session.get(User.class, userId);
			
			
			transaction.commit();
			
			if (transaction!=null) {
				transaction.rollback();
			}
			
		}
		return user;
		
	}
	
	
	@Override
	//@SuppressWarnings("unchecked")
	public List<User> getAllEmployee() {
		Transaction transaction=null;
		List<User> users=new ArrayList();
		
		
		try(Session session=HibernateUtil.getSesssionFactory().openSession()){
			
			transaction=session.beginTransaction();
			//users=session.createQuery("from employee");
			//session.createQuery("from employee");
			transaction.commit();
			
			if (transaction!=null) {
				transaction.rollback();
			}
			
		}
		return users;
	}
}
