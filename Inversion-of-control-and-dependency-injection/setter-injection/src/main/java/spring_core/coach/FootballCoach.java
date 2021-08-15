package spring_core.coach;

import spring_core.assistant.CoachAssistant;

public class FootballCoach implements Coach {

	private String name;
	private CoachAssistant assistant;

	public void setName(String name) {
		this.name = name;
	}

	public void setAssistant(CoachAssistant assistant) {
		this.assistant = assistant;
	}

	public String getDailyWorkout() {
		return "football coach daily workout";
	}

	@Override
	public String toString() {
		return "FootballCoach [name=" + name + ", assistant= (" + assistant.getEquipment() + " )]";
	}

}
