package com.project.HRM.service;

import java.util.List;


import com.project.HRM.entity.JobPosition;

public interface JobPositionService {

	// Save JobPosition
	public JobPosition saveJobPosition(JobPosition jobPosition);

	// Get All JobPosition
	public List<JobPosition> getAllJobPositions();

	// Get JobPosition by Id
	public JobPosition getJobPositionById(int jobPositionId);

	// Update JobPosition by Id
	public JobPosition updateJobPosition(JobPosition jobPosition, int jobPositionId);

	// Delete JobPosition by Id
	public String deleteJobPosition(int jobPositionId);

}
