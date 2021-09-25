package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Employee;

public class InversionOfControl {

	public static void main(String[] args) {

		ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee emp = appCtx.getBean("accountantXml", Employee.class);
		// Employee emp = appCtx.getBean("securityGuardXml", Exmployee.class);
		System.out.println(emp.getWorkingHours());

		((ClassPathXmlApplicationContext) appCtx).close();
	}

}
