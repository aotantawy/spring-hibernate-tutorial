package com.utilities.vehicle;

import com.utilities.mechanic.Mechanic;

public class Bicycle implements Vehicle {

	private double size;
	private Mechanic mechanic;

	public Bicycle(double size, Mechanic mechanic) {
		this.size = size;
		this.mechanic = mechanic;
	}

	@Override
	public String getFullDescription() {
		return String.format("Bicycle size: %f", size);
	}

	@Override
	public String getMechanicRole() {
		return mechanic.getRole();
	}

}
