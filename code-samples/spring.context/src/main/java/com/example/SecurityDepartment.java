package com.example;

import org.springframework.stereotype.Component;

@Component
public class SecurityDepartment implements Department {

	@Override
	public String getDepartmentName() {
		return "Security Department";
	}

}
