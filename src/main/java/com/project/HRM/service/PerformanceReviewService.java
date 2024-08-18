package com.project.HRM.service;

import java.util.List;

import com.project.HRM.entity.PerformanceReview;

public interface PerformanceReviewService {

	// Save PerformanceReview
	public PerformanceReview savePerformanceReview(PerformanceReview performanceReview);

	// Get All PerformanceReview
	public List<PerformanceReview> getAllPerformanceReview();

	// Get PerformanceReview by Id
	public PerformanceReview getPerformanceReviewById(int performanceReviewId);

	// Update PerformanceReview by Id
	public PerformanceReview updatePerformanceReview(PerformanceReview performanceReview, int performanceReviewId);

	// Delete PerformanceReview by Id
	public String deletePerformanceReview(int performanceReviewId);

}
