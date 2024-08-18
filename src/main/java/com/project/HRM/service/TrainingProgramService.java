package com.project.HRM.service;

import java.util.List;

import com.project.HRM.entity.TrainingProgram;

public interface TrainingProgramService {

	// Save TrainingProgram
	public TrainingProgram saveTrainingProgram(TrainingProgram trainingProgram);

	// Get All TrainingProgram
	public List<TrainingProgram> getAllTrainingProgram();

	// Get TrainingProgram by Id
	public TrainingProgram getTrainingProgramById(int trainingProgram);

	// Update TrainingProgram by Id
	public TrainingProgram updateTrainingProgram(TrainingProgram trainingProgram, int trainingProgramId);

	// Delete TrainingProgram by Id
	public String deleteTrainingProgram(int trainingProgramId);

}
