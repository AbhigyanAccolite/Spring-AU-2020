package com.assignment.model;

import javax.persistence.Entity;

@Entity
public class HumanResource extends Employee{
	private int hrId;
	private String hrName;
	
	public int getHrId() {
		return hrId;
	}
	public void setHrId(int hrId) {
		this.hrId = hrId;
	}
	public String getHrName() {
		return hrName;
	}
	public void setHrName(String hrName) {
		this.hrName = hrName;
	}
}
