package com.assignment.model;

public class Company extends Manager{
	private int companyId;
	private String companyName;
	
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public void setManagerId(int id) {
		super.setManagerId(id);
	}
	
	public int getManagerId() {
		return super.getManagerId();
	}
	
	

}
