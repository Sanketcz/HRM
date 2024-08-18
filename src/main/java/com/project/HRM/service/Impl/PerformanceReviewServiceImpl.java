package com.project.HRM.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.HRM.entity.PerformanceReview;
import com.project.HRM.exceptions.ResourceNotFound;
import com.project.HRM.repository.PerformanceReviewRepository;
import com.project.HRM.service.PerformanceReviewService;

@Service
public class PerformanceReviewServiceImpl implements PerformanceReviewService{

	@Autowired
	PerformanceReviewRepository performanceReviewRepository;
	
	@Override
	public PerformanceReview savePerformanceReview(PerformanceReview performanceReview) {
		return performanceReviewRepository.save(performanceReview);
	}

	@Override
	public List<PerformanceReview> getAllPerformanceReview() {
		return performanceReviewRepository.findAll();
	}

	@Override
	public PerformanceReview getPerformanceReviewById(int performanceReviewId) {
		return performanceReviewRepository.findById(performanceReviewId).orElseThrow(
				()->new ResourceNotFound("Performance Review with id "+performanceReviewId+" not Found..!")
				);
	}

	@Override
	public PerformanceReview updatePerformanceReview(PerformanceReview performanceReview, int performanceReviewId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletePerformanceReview(int performanceReviewId) {
		// TODO Auto-generated method stub
		return null;
	}

}
