package com.utilities.mechanic;

import org.springframework.stereotype.Component;

@Component
public class CarMechanic implements Mechanic {

	// This constructor just for debugging
	public CarMechanic() {
		System.out.println(">> car mechanic: constructor");
	}

	@Override
	public String getRole() {
		return "I'm a car mechanic";
	}

}
