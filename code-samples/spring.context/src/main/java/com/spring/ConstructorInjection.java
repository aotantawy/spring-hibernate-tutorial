package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Employee;

public class ConstructorInjection {

	public static void main(String[] args) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee emp = appCtx.getBean("accountantConstructorXml", Employee.class);

		System.out.println(emp);

		((ClassPathXmlApplicationContext) appCtx).close();
	}

}
