package com.utilities.vehicle;

import com.utilities.mechanic.Mechanic;

public class Car implements Vehicle {

	String model;
	Mechanic mechanic;

	// This constructor just for debugging
	public Car() {
		System.out.println(">> car: constructor");
	}

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

	private void postConstruction() {
		System.out.println(">> car: postConstruction()");
	}

	private void preDestruction() {
		System.out.println(">> car: preDestruction()");
	}

}
