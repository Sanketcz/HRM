package com.project.HRM.service;

import java.util.List;

import com.project.HRM.entity.Payroll;

public interface PayrollService {

	// Save LeaveRequest
	public Payroll savePayroll(Payroll payroll);

	// Get All LeaveRequest
	public List<Payroll> getAllPayroll();

	// Get LeaveRequest by Id
	public Payroll getPayrollById(int payrollId);

	// Update LeaveRequest by Id
	public Payroll updatePayroll(Payroll payroll, int payrollId);

	// Delete LeaveRequest by Id
	public String deletePayroll(int payrollId);

}
