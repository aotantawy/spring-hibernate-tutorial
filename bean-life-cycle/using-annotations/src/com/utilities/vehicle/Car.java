package com.utilities.vehicle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.utilities.mechanic.Mechanic;

@Component
public class Car implements Vehicle {

	String model;
	Mechanic mechanic;

	// This constructor just for debugging
	public Car() {
		System.out.println(">> car: constructor");
	}

	@Value("${car1.model}")
	public void setModel(String model) {
		this.model = model;
	}

	@Autowired
	public void setMechanic(Mechanic mechanic) {
		this.mechanic = mechanic;
	}

	@Override
	public String getFullDescription() {
		return String.format("Car Model: %s", model);
	}

	@Override
	public String getMechanicRole() {
		return mechanic.getRole();
	}

	@PostConstruct
	private void postConstruction() {
		System.out.println(">> car: postConstruction()");
	}

	@PreDestroy
	private void preDestruction() {
		System.out.println(">> car: preDestruction()");
	}

}
