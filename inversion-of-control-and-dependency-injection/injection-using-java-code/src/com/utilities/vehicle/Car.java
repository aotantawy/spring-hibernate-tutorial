package com.utilities.vehicle;

import org.springframework.beans.factory.annotation.Value;

import com.utilities.mechanic.Mechanic;

public class Car implements Vehicle {

	@Value("${car1.model}")
	String model;
	Mechanic mechanic;

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

}
