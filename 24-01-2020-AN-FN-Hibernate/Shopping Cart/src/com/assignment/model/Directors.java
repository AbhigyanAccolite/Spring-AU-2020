package com.assignment.model;

import javax.persistence.Entity;

@Entity
public class Directors {
	private int directorId;
	private String directorName;
	
	
	public int getDirectorId() {
		return directorId;
	}
	public void setDirectorId(int directorId) {
		this.directorId = directorId;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	
	
}
