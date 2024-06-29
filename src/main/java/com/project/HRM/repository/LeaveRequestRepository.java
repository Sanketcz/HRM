package com.project.HRM.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.HRM.entity.LeaveRequest;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Integer>{

}
