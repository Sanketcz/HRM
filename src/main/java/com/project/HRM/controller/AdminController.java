package com.project.HRM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.HRM.entity.Attendance;
import com.project.HRM.entity.Department;
import com.project.HRM.entity.Employee;
import com.project.HRM.entity.JobPosition;
import com.project.HRM.entity.LeaveRequest;
import com.project.HRM.entity.Payroll;
import com.project.HRM.entity.PerformanceReview;
import com.project.HRM.entity.TrainingProgram;
import com.project.HRM.service.AttendanceService;
import com.project.HRM.service.DepartmentService;
import com.project.HRM.service.EmployeeService;
import com.project.HRM.service.JobPositionService;
import com.project.HRM.service.LeaveRequestService;
import com.project.HRM.service.PayrollService;
import com.project.HRM.service.PerformanceReviewService;
import com.project.HRM.service.TrainingProgramService;

@CrossOrigin("*")
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
	
	@Autowired
	private LeaveRequestService leaveRequestService;
	
	@Autowired
	private PayrollService payrollService;
	
	@Autowired
	private PerformanceReviewService performanceReviewService;
	
	@Autowired
	private TrainingProgramService trainingProgramService;
	
	//Autowired Services ends here

//All Admin related method goes here
	
	@GetMapping("/")
	private ResponseEntity<?> admin(){
		return ResponseEntity.ok("Heyyy boii");
	}
	
//All Admin related method ends here
	
//All Attendance Related methods start here
	//Add
	public Attendance saveAttendance(Attendance attendance) {
		return attendanceService.saveAttendance(attendance);
	}
	//Get
	public List<Attendance> getAllAttendances(){
		return attendanceService.getAllAttendances();
	}
	//Get By Id
	public Attendance getAttendanceById(int attendanceId) {
		return attendanceService.getAttendanceById(attendanceId);
	}
	//Update
	//Delete
//All Attendance Related methods end here
	
//All Employee related methods goes here
	
	// Add
	@PostMapping("/addEmployee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){

		try {
			employee.setRole("ROLE_EMPLOYEE");
			if(employee.getDepartmentId()!=0) {
				Department department = departmentService.getDepartmentById(employee.getDepartmentId());
				employee.setDepartment(department);
			}
			Employee emp=employeeService.saveEmployee(employee);
			return ResponseEntity.ok(emp);			
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	// Get
	@GetMapping("/getAllEmployee")
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
	@GetMapping("/getAllDepartment")
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
	
//All JobPosition Related methods start here
	//Add
	public JobPosition saveJobPosition(JobPosition jobPosition) {
		return jobPositionService.saveJobPosition(jobPosition);
	}
	//Get
	public List<JobPosition> getAllJobPositions(){
		return jobPositionService.getAllJobPositions();
	}
	//Get By Id
	public JobPosition getJobPositionById(int jobPositionId) {
		return jobPositionService.getJobPositionById(jobPositionId);
	}
	//Update
	//Delete
//All JobPosition Related methods ends here

//All LeaveRequest Related method start here
	//Add
	public LeaveRequest saveLeaveRequest(LeaveRequest leaveRequest) {
		return leaveRequestService.saveLeaveRequest(leaveRequest);
	}
	//Get
	public List<LeaveRequest> getAllLeaveRequests(){
		return leaveRequestService.getAllLeaveRequest();
	}
	//GetById
	public LeaveRequest getLeaveRequestById(int leaveRequestId) {
		return leaveRequestService.getLeaveRequestById(leaveRequestId);
	}
	//Update
	//Delete
//All LeaveRequest Related method end here

// All Payroll Related method start here
	// Add
	public Payroll savePayroll(Payroll payroll) {
		return payrollService.savePayroll(payroll);
	}

	// Get
	public List<Payroll> getAllPayroll() {
		return payrollService.getAllPayroll();
	}

	// GetById
	public Payroll getPayrollById(int payrollId) {
		return payrollService.getPayrollById(payrollId);
	}
	// Update
	// Delete
//All Payroll Related method end here

// All PerformanceReview Related method start here
	// Add
	public PerformanceReview savePerformanceReview(PerformanceReview performanceReview) {
		return performanceReviewService.savePerformanceReview(performanceReview);
	}

	// Get
	public List<PerformanceReview> getAllPerformanceReview() {
		return performanceReviewService.getAllPerformanceReview();
	}

	// GetById
	public PerformanceReview getPerformanceReviewById(int performanceReviewId) {
		return performanceReviewService.getPerformanceReviewById(performanceReviewId);
	}
	// Update
	// Delete
//All PerformanceReview Related method end here

// All TrainingProgram Related method start here
	// Add
	public TrainingProgram saveTrainingProgram(TrainingProgram trainingProgram) {
		return trainingProgramService.saveTrainingProgram(trainingProgram);
	}

	// Get
	public List<TrainingProgram> getAllTrainingProgram() {
		return trainingProgramService.getAllTrainingProgram();
	}

	// GetById
	public TrainingProgram getTrainingProgramById(int trainingProgramId) {
		return trainingProgramService.getTrainingProgramById(trainingProgramId);
	}
	// Update
	// Delete
//All PerformanceReview Related method end here
	

	
}
