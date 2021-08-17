package com.utilities.vehicle;

import com.utilities.mechanic.Mechanic;

public class Car implements Vehicle {

	String model;
	Mechanic mechanic;

	public Car(String model, Mechanic mechanic) {
		this.model = model;
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
