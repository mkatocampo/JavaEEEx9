package edu.nbcc.model;

import java.util.ArrayList;
import java.util.List;

public class ErrorModel {
	private List<String> errors = new ArrayList<String>();
	
	public ErrorModel(String error) {
		this.errors.add(error);
	}
	/**
	 * @return the errors
	 */
	public List<String> getErrors() {
		return errors;
	}

	/**
	 * @param errors the errors to set
	 */
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	public ErrorModel() {
		
	}
	

}
