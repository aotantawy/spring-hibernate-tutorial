package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.utilities.mechanic.CarMechanic;
import com.utilities.mechanic.Mechanic;
import com.utilities.vehicle.Car;
import com.utilities.vehicle.Vehicle;

@Configuration
@ComponentScan("com.utilities.mechanic")
@ComponentScan("com.utilities.vehicle")
@PropertySource("classpath:cars.properties")
public class JavaConfig {

	@Bean
	public Mechanic carMechanic() {
		return new CarMechanic();
	}

	@Bean
	public Vehicle car() {
		Car carBean = new Car();
		carBean.setMechanic(carMechanic());
		return carBean;
	}

}
