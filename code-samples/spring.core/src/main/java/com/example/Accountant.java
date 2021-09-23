package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // For defining bean using annotations
public class Accountant implements Employee {
	@Value("osos")
	private String employeeName;

	@Autowired
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
