package com.assignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.assignment.model.Employee;

@Configuration
@ComponentScan(basePackages = "com.*")
public class AppConfig {
	
		
		
		@Bean
		public Employee getEmployee() {
			return new Employee(1,"Abhigyan","Nayak");
		}
	
		@Bean
		public Employee getAnotherEmployee() {
			return new Employee(2,"Gaurav", "Yadav");
		}
	
		@Bean
		public Employee getOneMoreEmployee() {
			return new Employee(3,"Omkar","Raykar");
		}
	
}

