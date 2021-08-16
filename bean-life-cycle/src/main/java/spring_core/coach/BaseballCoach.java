package spring_core.coach;

import spring_core.assistant.CoachAssistant;

public class BaseballCoach implements Coach {

	private String name;
	private CoachAssistant assistant;

	public BaseballCoach(String name, CoachAssistant assistant) {
		this.name = name;
		this.assistant = assistant;
	}

	public String getDailyWorkout() {
		return "baseball coach daily workout";
	}

	@Override
	public String toString() {
		return "BaseballCoach [name=" + name + ", assistant=" + assistant.getEquipment() + "]";
	}

	public void initializeBean() {
		System.out.println("baseball Coach: bean initialization");
	}

	public void destoryBean() {
		System.out.println("baseball Coach: bean destruction");
	}

}
