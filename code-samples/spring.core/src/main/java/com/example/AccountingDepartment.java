package com.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AccountingDepartment implements Department {

	@Override
	public String getDepartmentName() {
		return "Accounting Department";
	}

}
