package com.project.HRM.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.HRM.entity.TrainingProgram;
import com.project.HRM.exceptions.ResourceNotFound;
import com.project.HRM.repository.TrainingProgramRepository;
import com.project.HRM.service.TrainingProgramService;

@Service
public class TrainingProgramServiceImpl implements TrainingProgramService{

	@Autowired
	TrainingProgramRepository trainingProgramRepository;
	
	@Override
	public TrainingProgram saveTrainingProgram(TrainingProgram trainingProgram) {
		return trainingProgramRepository.save(trainingProgram);
	}

	@Override
	public List<TrainingProgram> getAllTrainingProgram() {
		return trainingProgramRepository.findAll();
	}

	@Override
	public TrainingProgram getTrainingProgramById(int trainingProgram) {
		return trainingProgramRepository.findById(trainingProgram).orElseThrow(
				()->new ResourceNotFound("Training Program with id "+trainingProgram+" not Found..!")
				);
	}

	@Override
	public TrainingProgram updateTrainingProgram(TrainingProgram trainingProgram, int trainingProgramId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteTrainingProgram(int trainingProgramId) {
		// TODO Auto-generated method stub
		return null;
	}

}
