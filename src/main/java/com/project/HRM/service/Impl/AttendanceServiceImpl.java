package com.project.HRM.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.HRM.entity.Attendance;
import com.project.HRM.exceptions.ResourceNotFound;
import com.project.HRM.repository.AttendanceRepository;
import com.project.HRM.service.AttendanceService;
@Service
public class AttendanceServiceImpl  implements AttendanceService{
	
	@Autowired
	private AttendanceRepository attendanceRepository;

	@Override
	public Attendance saveAttendance(Attendance attendance) {
		return attendanceRepository.save(attendance);
	}

	@Override
	public List<Attendance> getAllAttendances() {
		return attendanceRepository.findAll();
	}

	@Override
	public Attendance getAttendanceById(int attendanceId) {
		return attendanceRepository.findById(attendanceId).orElseThrow(
				()->new ResourceNotFound("Attendance with given Id not Found")
				);
	}

	@Override
	public Attendance updateAttendance(Attendance attendance, int attendanceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAttendance(int attendanceId) {
		// TODO Auto-generated method stub
		return null;
	}

}
