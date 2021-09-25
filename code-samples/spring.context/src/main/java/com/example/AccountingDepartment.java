package com.example;

import org.springframework.stereotype.Component;

@Component
public class AccountingDepartment implements Department {

	@Override
	public String getDepartmentName() {
		return "Accounting Department";
	}

}
