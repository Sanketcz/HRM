package com.project.HRM.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.HRM.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
