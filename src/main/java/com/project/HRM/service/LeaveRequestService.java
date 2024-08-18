package com.project.HRM.service;

import java.util.List;

import com.project.HRM.entity.LeaveRequest;

public interface LeaveRequestService {

	// Save LeaveRequest
	public LeaveRequest saveLeaveRequest(LeaveRequest leaveRequest);

	// Get All LeaveRequest
	public List<LeaveRequest> getAllLeaveRequest();

	// Get LeaveRequest by Id
	public LeaveRequest getLeaveRequestById(int leaveRequestId);

	// Update LeaveRequest by Id
	public LeaveRequest updateLeaveRequest(LeaveRequest leaveRequest, int leaveRequestId);

	// Delete LeaveRequest by Id
	public String deleteLeaveRequest(int leaveRequestId);

}
