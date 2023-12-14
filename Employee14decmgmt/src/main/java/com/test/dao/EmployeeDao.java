package com.test.dao;

import com.test.entity.Employee;

public interface EmployeeDao {
	public abstract void addEmployee(Employee employee);
	public abstract Employee  fetchEmployeebyId(int employeeId);
	public abstract void updateEmployeeById(int employeeId,Double newSal);
	public abstract void  deleteEmployeeById(Integer employeeId);
}
