package com.example;

import org.springframework.stereotype.Component;

@Component // for defining beans using annotations
public class SecurityGuard implements Employee {
	private String employeeName;
	private Department department;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String getWorkingHours() {
		return "Security guard: 12am => 7am";

	}

	@Override
	public String toString() {
		return "SecurityGuard [employeeName=" + employeeName + ", department=" + department.getDepartmentName() + "]";
	}

}
