package com.utilities.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.utilities.mechanic.Mechanic;

@Component
public class Bicycle implements Vehicle {

	private double size;
	private Mechanic mechanic;

	@Value("8")
	public void setSize(double size) {
		this.size = size;
	}

	@Autowired
	@Qualifier("bicycleMechanic")
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
