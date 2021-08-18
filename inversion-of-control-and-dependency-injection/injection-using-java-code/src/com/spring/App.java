package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.utilities.vehicle.Vehicle;

/*
 * For learning purposes:
 * 	1. I use constructor injection using annotations to create bicycle bean 
 * 	2. I use setter injection using java code configuration to create car bean
 * but this is not best practice in this situation
 */

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				JavaConfig.class);

		Vehicle bicycle = applicationContext.getBean("bicycle", Vehicle.class);
		Vehicle car = applicationContext.getBean("car", Vehicle.class);

		System.out.println("===============");

		System.out.println(bicycle.getFullDescription());
		System.out.println(bicycle.getMechanicRole());

		System.out.println("===============");

		System.out.println(car.getFullDescription());
		System.out.println(car.getMechanicRole());

		System.out.println("===============");

		applicationContext.close();

	}

}
