package com.utilities.mechanic;

import org.springframework.stereotype.Component;

@Component
public class CarMechanic implements Mechanic {

	@Override
	public String getRole() {
		return "I'm a car mechanic";
	}

}
