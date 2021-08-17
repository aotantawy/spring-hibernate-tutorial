package com.utilities.mechanic;

import org.springframework.stereotype.Component;

@Component
public class BicycleMechanic implements Mechanic {

	@Override
	public String getRole() {
		return "I'm a bicycle mechanic";
	}

}
