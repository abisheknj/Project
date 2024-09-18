package com.tutorsdude.project;

import com.tutorsdude.project.model.Employee;
import com.tutorsdude.project.service.EmployeeService;
import com.tutorsdude.project.service.EmployeeServiceImpl;

public class ProjectRunner {
	
	public static void main(String[] args) {
		
		EmployeeService service = new EmployeeServiceImpl();
		
		service.save(new Employee());
		
	}

}
