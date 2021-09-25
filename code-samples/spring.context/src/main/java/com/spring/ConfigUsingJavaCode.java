package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Accountant;
import com.example.Employee;

public class ConfigUsingJavaCode {

	public static void main(String[] args) {
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(AppConfig.class);

		Employee emp = appCtx.getBean(Accountant.class);
		System.out.println(emp.getWorkingHours());
		System.out.println(emp);

		((AnnotationConfigApplicationContext) appCtx).close();
	}

}
