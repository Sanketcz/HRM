package com.project.HRM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.HRM.entity.Department;
import com.project.HRM.entity.Employee;
import com.project.HRM.service.AttendanceService;
import com.project.HRM.service.DepartmentService;
import com.project.HRM.service.EmployeeService;
import com.project.HRM.service.JobPositionService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	//Autowired Services goes here
	
	@Autowired
	private AttendanceService attendanceService;
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private JobPositionService jobPositionService;
	
	//Autowired Services ends here

//All Admin related method goes here
	
	@RequestMapping("/")
	private ResponseEntity<?> admin(){
		return ResponseEntity.ok("Heyyy boii");
	}
	
//All Admin related method ends here
	
//All Attendance related methods goes here
	
	//Add
	//Get
	//GetById
	//Update
	//Delete
	
//All Attendance related method ends here
	
//All Employee related methods goes here
	
	// Add
	@PostMapping("/addEmployee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){

		try {
			employee.setRole("ROLE_EMPLOYEE");
			Employee emp=employeeService.saveEmployee(employee);
			return ResponseEntity.ok(emp);			
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	// Get
	@GetMapping("/getEmployee")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> employeeList=employeeService.getAllEmoloyees();
		return ResponseEntity.ok(employeeList);
	}
	// GetById
	@GetMapping("/getEmployee/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int id){
		Employee emp = employeeService.getEmployeeById(id);
		return ResponseEntity.ok(emp);
	}
	// Update
	// Delete
	
//All Employee related method ends here
	
//All Department related methods goes here
	
	// Add
	@PostMapping("/addDepartment")
	public ResponseEntity<Department> addDepartment(@RequestBody Department department){
		try {
			Department dept = departmentService.saveDepartment(department);
			return ResponseEntity.ok(dept);
		}
		catch(Exception e) {
			return null;
		}
	}
	// Get
	@GetMapping("/getDepartment")
	public ResponseEntity<List<Department>> getAllDepartments(){
		List<Department> dept = departmentService.getAllDepartments();
		return ResponseEntity.ok(dept);
	}
	// GetById
	@GetMapping("/getDepartment/{deptId}")
	public ResponseEntity<Department> getDepartmentById(@PathVariable("deptId") int deptId){
		Department dept = departmentService.getDepartmentById(deptId);
		return ResponseEntity.ok(dept);
	}
	// Update
	// Delete
	
//All Department related method ends here
	
}
