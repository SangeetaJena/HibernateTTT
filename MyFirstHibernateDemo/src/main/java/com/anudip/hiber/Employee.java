package com.anudip.hiber;
/*Hibernate is a Java-based persistence framework and an object-relational mapping (ORM) 
framework that 
basically allows a developer to map POJO - plain old Java objects - to relational database tables.
What is ORM in Hibernate?

Hibernate ORM stands for Object Relational Mapping. This is a mapping tool pattern mainly 
used for converting data stored in a 
relational database to an object used in object-oriented programming constructs. 

 important interfaces of Hibernate framework?
 
 Configuaration
 
 SessionFactory
 
 SessionFactory provides an instance of Session.
 
 Session
 A session is an object that maintains the connection between Java object application and database.
 
 Transaction
 End to end operation that will perform on the data using session object.
 
 Query
 
 Criteria
 
 
 Object         Employee emp = new Employee();   
 reference 		Employee emp;
 
 				emp=new Employee();
 
 instance       new Employee();  
 
*/

import javax.persistence.Entity;
import javax.persistence.Id;

//pojo -plain old java object

//Bean //spring
//Entity
// annotation to give infornation that it will mapped

@Entity
public class Employee {   
	@Id
	private int id;          
	  
	private String name;     
	
	private String desig;     
	
	private String sal;
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String desig, String sal) {
		super();
		this.id = id;
		this.name = name;
		this.desig = desig;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}
	
	
	
}
