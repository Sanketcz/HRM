package com.project.HRM.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.HRM.entity.LeaveRequest;
import com.project.HRM.exceptions.ResourceNotFound;
import com.project.HRM.repository.LeaveRequestRepository;
import com.project.HRM.service.LeaveRequestService;
@Service
public class LeaveRequestServiceImpl implements LeaveRequestService{

	@Autowired
	LeaveRequestRepository leaveRequestRepository;
	
	@Override
	public LeaveRequest saveLeaveRequest(LeaveRequest leaveRequest) {
		return leaveRequestRepository.save(leaveRequest);
	}

	@Override
	public List<LeaveRequest> getAllLeaveRequest() {
		return leaveRequestRepository.findAll();
	}

	@Override
	public LeaveRequest getLeaveRequestById(int leaveRequestId) {
		return leaveRequestRepository.findById(leaveRequestId).orElseThrow(
				()->new ResourceNotFound("Leave Request with id "+leaveRequestId+" not Found..!")
				);
	}

	@Override
	public LeaveRequest updateLeaveRequest(LeaveRequest leaveRequest, int leaveRequestId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteLeaveRequest(int leaveRequestId) {
		// TODO Auto-generated method stub
		return null;
	}

}
