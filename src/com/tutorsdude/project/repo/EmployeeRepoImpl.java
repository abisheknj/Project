package com.tutorsdude.project.repo;

import com.tutorsdude.project.model.Employee;

public class EmployeeRepoImpl implements EmployeeRepo {

	@Override
	public boolean save(Employee emp) {
		System.out.println(emp);
		System.out.println("emp saved");
		return true;
	}

}
