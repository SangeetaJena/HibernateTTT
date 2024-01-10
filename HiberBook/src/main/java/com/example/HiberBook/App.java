package com.example.HiberBook;

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
         Book obj=new Book();
         obj.setId(56L);
         obj.setTitle("My Life");
         obj.setPrice(234);
         obj.setYear(2345);
         obj.setAuthor("sami");
         session.save(obj);
        System.out.println("Book added");
         transaction.commit();
         session.close();
         
    }
}
