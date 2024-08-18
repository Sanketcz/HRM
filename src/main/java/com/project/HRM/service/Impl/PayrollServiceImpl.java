package com.project.HRM.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.HRM.entity.Payroll;
import com.project.HRM.exceptions.ResourceNotFound;
import com.project.HRM.repository.PayrollRepository;
import com.project.HRM.service.PayrollService;

@Service
public class PayrollServiceImpl implements PayrollService{

	@Autowired
	PayrollRepository payrollRepository;
	
	@Override
	public Payroll savePayroll(Payroll payroll) {
		return payrollRepository.save(payroll);
	}

	@Override
	public List<Payroll> getAllPayroll() {
		return payrollRepository.findAll();
	}

	@Override
	public Payroll getPayrollById(int payrollId) {
		return payrollRepository.findById(payrollId).orElseThrow(
				()->new ResourceNotFound("Payroll with id "+payrollId+" not Found..!")
				);
	}

	@Override
	public Payroll updatePayroll(Payroll payroll, int payrollId) {
		return null;
	}

	@Override
	public String deletePayroll(int payrollId) {
		return null;
	}

}
