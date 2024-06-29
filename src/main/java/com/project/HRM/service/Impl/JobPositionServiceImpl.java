package com.project.HRM.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.HRM.entity.JobPosition;
import com.project.HRM.exceptions.ResourceNotFound;
import com.project.HRM.repository.JobPositionRepository;
import com.project.HRM.service.JobPositionService;
@Service
public class JobPositionServiceImpl implements JobPositionService{

	@Autowired
	private JobPositionRepository jobPositionRepository;
	
	@Override
	public JobPosition saveJobPosition(JobPosition jobPosition) {
		return jobPositionRepository.save(jobPosition);
	}

	@Override
	public List<JobPosition> getAllJobPositions() {
		return jobPositionRepository.findAll();
	}

	@Override
	public JobPosition getJobPositionById(int jobPositionId) {
		return jobPositionRepository.findById(jobPositionId).orElseThrow(
				()->new ResourceNotFound("Job Position with id "+jobPositionId+" not Found..!")
				);
	}

	@Override
	public JobPosition updateJobPosition(JobPosition jobPosition, int jobPositionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteJobPosition(int jobPositionId) {
		// TODO Auto-generated method stub
		return null;
	}

}
