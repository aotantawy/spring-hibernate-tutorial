package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.Accountant;

// Configure beans using java code

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {

	@Bean
	public Accountant getAccountant() {
		return new Accountant();
	}

//	@Bean
//	public Department getDepartment() {
//		return new AccountingDepartment();
//	}

}
