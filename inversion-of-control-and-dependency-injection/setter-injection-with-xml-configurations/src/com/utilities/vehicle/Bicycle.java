package com.utilities.vehicle;

import com.utilities.mechanic.Mechanic;

public class Bicycle implements Vehicle {

	private double size;
	private Mechanic mechanic;

	public void setSize(double size) {
		this.size = size;
	}

	public void setMechanic(Mechanic mechanic) {
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
