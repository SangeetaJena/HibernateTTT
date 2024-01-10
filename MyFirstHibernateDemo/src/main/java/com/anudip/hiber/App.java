package com.anudip.hiber;

import java.util.ArrayList;

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
    
       Configuration cfg =new Configuration(); //configuring the hibernate.cfg.xml
       cfg.configure("hibernate.cfg.xml");
       
       
       //craated  a Session factory- once
       SessionFactory sessionFactory=cfg.buildSessionFactory();
       //created  a session
       Session session=sessionFactory.openSession();
       //created trabsaction
       Transaction transaction=session.beginTransaction();
       
       Employee emp=new Employee();
       emp.setId(1);
       emp.setName("Padmaja");
       emp.setDesig("Trainer");
       emp.setSal("100000");
       
       session.save(emp);
       System.out.println("Employee Add hua");
       transaction.commit();
       session.close();
       
       
       
    }
}
