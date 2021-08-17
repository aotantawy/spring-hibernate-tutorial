package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.utilities.vehicle.Car;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Car car = applicationContext.getBean("car", Car.class);

		System.out.println("====================");

		System.out.println(car.getFullDescription());
		System.out.println(car.getMechanicRole());

		System.out.println("====================");

		applicationContext.close();
	}

}
