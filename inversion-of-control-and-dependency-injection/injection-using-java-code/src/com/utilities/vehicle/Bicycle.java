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

	public Bicycle(@Value("15") double size, @Autowired @Qualifier("bicycleMechanic") Mechanic mechanic) {
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
