package com.project.HRM.exceptions;

public class ResourceNotFound extends RuntimeException{

	public ResourceNotFound() {
		super("Resource Not Fornd..!");
	}
	
	public ResourceNotFound(String msg) {
		super(msg);
	}
}
