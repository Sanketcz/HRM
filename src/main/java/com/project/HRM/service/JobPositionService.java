package com.project.HRM.service;

import java.util.List;


import com.project.HRM.entity.JobPosition;

public interface JobPositionService {

	// Save Department
	public JobPosition saveJobPosition(JobPosition jobPosition);

	// Get All Departments
	public List<JobPosition> getAllJobPositions();

	// Get Department by Id
	public JobPosition getJobPositionById(int jobPositionId);

	// Update Department by Id
	public JobPosition updateJobPosition(JobPosition jobPosition, int jobPositionId);

	// Delete Department by Id
	public String deleteJobPosition(int jobPositionId);

}
