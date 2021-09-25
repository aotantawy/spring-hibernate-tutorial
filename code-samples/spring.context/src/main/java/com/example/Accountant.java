package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

//@Component // For defining bean using annotations
public class Accountant implements Employee {
	@Value("Ahmed Osama")
	private String employeeName;

	@Autowired
	@Qualifier("accountingDepartment")
	private Department department;

	public Accountant() {
	}

	public Accountant(String employeeName, Department department) {
		this.employeeName = employeeName;
		this.department = department;
	}

	@Override
	public String getWorkingHours() {
		return "Accountant: work from 9 => 5";
	}

	@Override
	public String toString() {
		return "Accountant [employeeName=" + employeeName + ", department=" + department.getDepartmentName() + "]";
	}

}
