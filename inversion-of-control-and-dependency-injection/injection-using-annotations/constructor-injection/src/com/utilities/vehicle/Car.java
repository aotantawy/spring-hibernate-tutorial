package com.utilities.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.utilities.mechanic.Mechanic;

@Component
public class Car implements Vehicle {

	String model;
	Mechanic mechanic;

	public Car(@Value("${car1.model}") String model, @Autowired @Qualifier("carMechanic") Mechanic mechanic) {
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
