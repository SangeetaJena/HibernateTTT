package com.annotationdemo.example.Hibernate1to1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.annotationdemo.example.Hibernate1to1.Entity.Address;
import com.annotationdemo.example.Hibernate1to1.Entity.User;


public class App 
{
    public static void main(String[] args) 
    {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		try 
		{
		  User user=new User();
		  user.setUsername("Ram");
		  
		  Address address=new Address();
		  address.setStreet("Mumbai goregaon");
		  
		  user.setAddress(address);
		  address.setUser(user);
		  
		  session.save(user);
		  session.getTransaction().commit();
		
		  User retrievedUser=session.get(User.class, user.getId());
		  Address retrievedAddress=retrievedUser.getAddress();
		  
		  System.out.println("User: "+retrievedUser.getUsername());
		  System.out.println("Address: "+retrievedAddress.getStreet());
		}
		finally 
		{
			session.close();
            sessionFactory.close();
		}
	}
}
