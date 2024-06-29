package com.project.HRM.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.HRM.entity.Department;
import com.project.HRM.exceptions.ResourceNotFound;
import com.project.HRM.repository.DepartmentRepository;
import com.project.HRM.service.DepartmentService;
@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	@Override
	public Department getDepartmentById(int deptId) {
		return departmentRepository.findById(deptId).orElseThrow(
				()->new ResourceNotFound("Department with Id "+deptId+" not Found")
				);
	}

	@Override
	public Department updateDepartment(Department department, int deptId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteDepartment(int deptId) {
		// TODO Auto-generated method stub
		return null;
	}

}
