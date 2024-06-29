package com.project.HRM.service;

import java.util.List;


import com.project.HRM.entity.Attendance;

public interface AttendanceService {

	// Save Department
	public Attendance saveAttendance(Attendance attendance);

	// Get All Departments
	public List<Attendance> getAllAttendances();

	// Get Department by Id
	public Attendance getAttendanceById(int attendanceId);

	// Update Department by Id
	public Attendance updateAttendance(Attendance attendance, int attendanceId);

	// Delete Department by Id
	public String deleteAttendance(int attendanceId);

}
