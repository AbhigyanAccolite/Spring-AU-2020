package com.assignment.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
@NamedNativeQuery(name = "Employee.getEmployee", query = "SELECT * FROM Employee", resultClass=Employee.class)
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	@OneToMany
	@JoinTable(name = "Employee_Managers", joinColumns = @JoinColumn(name = "id"), inverseJoinColumns = @JoinColumn(name = "managerId"))
	private Collection<Employee> emps;
	private int id;
	private String firstName;
	private String lastName;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
