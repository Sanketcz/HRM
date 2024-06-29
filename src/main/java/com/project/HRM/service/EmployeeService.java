package com.project.HRM.service;

import java.util.List;


import com.project.HRM.entity.Employee;

public interface EmployeeService {

	//Save Employee
	public Employee saveEmployee(Employee employee);
	
	//Get All Employees
	public List<Employee> getAllEmoloyees();
	
	//Get Employee by Id
	public Employee getEmployeeById(int id);
	
	//Update Employee
	public Employee updateEmployee(Employee employee,int id);
	
	//Delete Employee
	public String deleteEmployee(int id);
	
}
