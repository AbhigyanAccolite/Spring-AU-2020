package com.assignment.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;


@Aspect
public class EmployeeAspect {	
	LocalTime startTime;
	LocalTime endTime;
	
	
	@Before("execution( * com.assignment.service.EmployeeService.getAllEmployee(..))")
	public void logBeforeV1(JoinPoint joinPoint) {
		startTime = LocalTime.now();
		System.out.println("EmployeeAspect.logBeforeV1()" + joinPoint.getSignature().getName());
	}	

	@After("execution( * com.assignment.service.EmployeeService.getAllEmployee(..))")
	public void logBeforeV2(JoinPoint joinPoint) {
		endTime = localTime.now();
		System.out.println("EmployeeAspect.logBeforeV1()" + joinPoint.getSignature().getName());
		System.out.println("Method execution time is: " + duration.between(startTime, endTime);
	}
}
