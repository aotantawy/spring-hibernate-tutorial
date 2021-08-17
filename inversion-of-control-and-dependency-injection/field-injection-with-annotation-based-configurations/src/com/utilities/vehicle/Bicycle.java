package com.utilities.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.utilities.mechanic.Mechanic;

@Component
public class Bicycle implements Vehicle {

	@Value("20")
	private double size;
	@Autowired
	@Qualifier("bicycleMechanic")
	private Mechanic mechanic;

	@Override
	public String getFullDescription() {
		return String.format("Bicycle size: %f", size);
	}

	@Override
	public String getMechanicRole() {
		return mechanic.getRole();
	}

}
