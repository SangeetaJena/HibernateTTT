package com.test.serviceimpl;

import com.test.daoImpl.EmployeeDAOImpl;
import com.test.entity.Employee;
import com.test.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public void createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		new EmployeeDAOImpl().addEmployee(employee);
		
	}

	@Override
	public Employee getEmployeebyId(int employeeId) {
		// TODO Auto-generated method stub
		return new EmployeeDAOImpl().fetchEmployeebyId(employeeId);
		
	}

	@Override
	public void updateEmployeeById(int employeeId, Double newSal) {
		// TODO Auto-generated method stub
		new EmployeeDAOImpl().updateEmployeeById(employeeId, newSal);
		
	}

	@Override
	public void deleteEmployeeById(Integer employeeId) {
		// TODO Auto-generated method stub
		
	}

}
