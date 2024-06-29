package com.project.HRM.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.HRM.entity.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer>{

}
