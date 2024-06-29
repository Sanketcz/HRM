package com.project.HRM.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.HRM.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
