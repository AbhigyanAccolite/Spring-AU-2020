package com.assignment.main;

import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.assignment.model.Employee;

public class MainClass {
	public static void main(String[] args) {
		  ApplicationContext context = new FileSystemXmlApplicationContext("map.xml");
		HashMap<String, Employee> emp = (HashMap<String, Employee>)context.getBean("maps");
		
		
		
		System.out.println(emp.toString());

		EmployeeService employeeService = context.getBean(EmployeeService.class);
		System.out.println(employeeService.getAllEmployees());

		PointService pointService = anotherContext.getBean(PointService.class);
		System.out.println(pointService.getPoint());
	}

}
