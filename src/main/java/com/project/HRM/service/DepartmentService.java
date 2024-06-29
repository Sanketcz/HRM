package com.project.HRM.service;

import java.util.List;


import com.project.HRM.entity.Department;

public interface DepartmentService {
	
	// Save Department
	public Department saveDepartment(Department department);

	// Get All Departments
	public List<Department> getAllDepartments();

	// Get Department by Id
	public Department getDepartmentById(int deptId);

	// Update Department by Id
	public Department updateDepartment(Department department, int deptId);

	// Delete Department by Id
	public String deleteDepartment(int deptId);

}
