package com.md.HibernateWithCRUD;

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
       Configuration cfg=new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory factory=cfg.buildSessionFactory();
       Session session=factory.openSession();
       Transaction transaction=session.beginTransaction();
       
       Student st=new Student();
       
       st.setName("mahi");
       st.setSubject("Java");
       st.setRoomNo(102);
       st.setCity("NYC");
       
       session.save(st);
       transaction.commit();
       
       
       
    }
}
