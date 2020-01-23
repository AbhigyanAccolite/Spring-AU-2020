package com.assignment.service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.assignment.model.Employee;

public class EmployeeService {
	
	public List<Employee> getAllEmployee() {
		System.out.println(LocalTime.now() + "Method getallEmployee called");
		long startTime = System.nanoTime();
//		methodToTime();
		long endTime = System.nanoTime();

		long duration = (endTime - startTime);
		System.out.println(duration);
		return new ArrayList<Employee>();
	}

}
