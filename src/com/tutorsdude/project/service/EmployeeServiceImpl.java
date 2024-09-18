package com.tutorsdude.project.service;

import com.tutorsdude.project.model.Employee;
import com.tutorsdude.project.repo.EmployeeRepo;
import com.tutorsdude.project.repo.EmployeeRepoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeRepo repo = new EmployeeRepoImpl();

	@Override
	public boolean save(Employee emp) {
		return true;
	}

}
