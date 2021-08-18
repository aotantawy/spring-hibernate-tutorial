package com.utilities.vehicle;

import com.utilities.mechanic.Mechanic;

public class Car implements Vehicle {

	String model;
	Mechanic mechanic;

	public void setModel(String model) {
		this.model = model;
	}

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
