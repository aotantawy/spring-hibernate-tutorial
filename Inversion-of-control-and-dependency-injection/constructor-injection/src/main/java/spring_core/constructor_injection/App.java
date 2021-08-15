package spring_core.constructor_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_core.coach.Coach;

public class App {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach coach = applicationContext.getBean("coach", Coach.class);
		System.out.println(coach);
		System.out.println(coach.getDailyWorkout());
		
		applicationContext.close();

	}
}
