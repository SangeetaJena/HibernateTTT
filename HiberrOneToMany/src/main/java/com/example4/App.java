package com.example4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example4.model.Department;
import com.example4.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        
        try 
        {
        Department department=new Department();
        department.setName("Marketting");
        Department department1=new Department();
        department1.setName("IT");
        Employee employee1=new Employee();
        employee1.setName("Rajan");
        employee1.setDepartment(department);
        
        Employee employee2=new Employee();
        employee2.setName("Ayan");
        employee2.setDepartment(department1);
        
        
        Employee employee3=new Employee();
        employee3.setName("Avyan");
        employee3.setDepartment(department1);
        
        department.getEmployees().add(employee1);
        department1.getEmployees().add(employee2);
        department1.getEmployees().add(employee3);
        session.beginTransaction();
        session.save(department);
        session.save(department1);
        
        session.getTransaction().commit();
        }
        finally 
        {
        	session.close();
        	sessionFactory.close();
        }
        
        
        
    }
}




