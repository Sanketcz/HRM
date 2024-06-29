package com.project.HRM.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Payroll {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    private String month;

    private int year;

    private Double basicSalary;

    private Double bonuses;

    private Double deductions;

    private Double netSalary;
 
    //Constructors
	public Payroll() {
		super();
	}

	public Payroll(Long id, Employee employee, String month, int year, Double basicSalary, Double bonuses,
			Double deductions, Double netSalary) {
		super();
		this.id = id;
		this.employee = employee;
		this.month = month;
		this.year = year;
		this.basicSalary = basicSalary;
		this.bonuses = bonuses;
		this.deductions = deductions;
		this.netSalary = netSalary;
	}

    // Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(Double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public Double getBonuses() {
		return bonuses;
	}

	public void setBonuses(Double bonuses) {
		this.bonuses = bonuses;
	}

	public Double getDeductions() {
		return deductions;
	}

	public void setDeductions(Double deductions) {
		this.deductions = deductions;
	}

	public Double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(Double netSalary) {
		this.netSalary = netSalary;
	}
   
	
	

}
