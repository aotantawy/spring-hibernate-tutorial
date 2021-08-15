package spring_core.coach;

import spring_core.assistant.CoachAssistant;

public class BaseballCoach implements Coach {

	private String name;
	private CoachAssistant assistant;

	public void setName(String name) {
		this.name = name;
	}

	public void setAssistant(CoachAssistant assistant) {
		this.assistant = assistant;
	}

	public String getDailyWorkout() {
		return "baseball coach daily workout";
	}

	@Override
	public String toString() {
		return "BaseballCoach [name=" + name + ", assistant=" + assistant.getEquipment() + "]";
	}

}
