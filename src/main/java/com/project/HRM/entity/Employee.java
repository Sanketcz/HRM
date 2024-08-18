package com.project.HRM.entity;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;

@Entity
public class Employee {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;

	    private String email;
	    
	    private String password;
	    
	    private String role;

	    private String position;

	    private Double salary;

	    private Date dateOfJoining;

	    private String status;

	    @ManyToOne
	    @JoinColumn(name = "department_id")
	    @JsonBackReference
	    private Department department;

	    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	    private List<Attendance> attendanceRecords;

	    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	    private List<LeaveRequest> leaveRequests;

	    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	    private List<PerformanceReview> performanceReviews;

	    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	    private List<Payroll> payrolls;

	    @ManyToMany
	    @JoinTable(
	        name = "employee_training",
	        joinColumns = @JoinColumn(name = "employee_id"),
	        inverseJoinColumns = @JoinColumn(name = "training_id")
	    )
	    private List<TrainingProgram> trainingPrograms;
	    
	    @Transient
	    private int departmentId;

	    //Constructors
		public Employee() {
			super();
		}

		public Employee(Long id, String name, String email, String position, Double salary, Date dateOfJoining,
				String status, Department department, List<Attendance> attendanceRecords,
				List<LeaveRequest> leaveRequests, List<PerformanceReview> performanceReviews, List<Payroll> payrolls,
				List<TrainingProgram> trainingPrograms,String role,int departmentId,String password) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.position = position;
			this.salary = salary;
			this.dateOfJoining = dateOfJoining;
			this.status = status;
			this.department = department;
			this.attendanceRecords = attendanceRecords;
			this.leaveRequests = leaveRequests;
			this.performanceReviews = performanceReviews;
			this.payrolls = payrolls;
			this.trainingPrograms = trainingPrograms;
			this.role = role;
			this.departmentId = departmentId;
			this.password = password;
		}

	    // Getters and Setters
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public Double getSalary() {
			return salary;
		}

		public void setSalary(Double salary) {
			this.salary = salary;
		}

		public Date getDateOfJoining() {
			return dateOfJoining;
		}

		public void setDateOfJoining(Date dateOfJoining) {
			this.dateOfJoining = dateOfJoining;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Department getDepartment() {
			return department;
		}

		public void setDepartment(Department department) {
			this.department = department;
		}

		public List<Attendance> getAttendanceRecords() {
			return attendanceRecords;
		}

		public void setAttendanceRecords(List<Attendance> attendanceRecords) {
			this.attendanceRecords = attendanceRecords;
		}

		public List<LeaveRequest> getLeaveRequests() {
			return leaveRequests;
		}

		public void setLeaveRequests(List<LeaveRequest> leaveRequests) {
			this.leaveRequests = leaveRequests;
		}

		public List<PerformanceReview> getPerformanceReviews() {
			return performanceReviews;
		}

		public void setPerformanceReviews(List<PerformanceReview> performanceReviews) {
			this.performanceReviews = performanceReviews;
		}

		public List<Payroll> getPayrolls() {
			return payrolls;
		}

		public void setPayrolls(List<Payroll> payrolls) {
			this.payrolls = payrolls;
		}

		public List<TrainingProgram> getTrainingPrograms() {
			return trainingPrograms;
		}

		public void setTrainingPrograms(List<TrainingProgram> trainingPrograms) {
			this.trainingPrograms = trainingPrograms;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public int getDepartmentId() {
			return departmentId;
		}

		public void setDepartmentId(int departmentId) {
			this.departmentId = departmentId;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
		
	
}
