package spring_core.coach;

import spring_core.assistant.CoachAssistant;

public class FootballCoach implements Coach {

	private String name;
	private CoachAssistant assistant;

	public FootballCoach(String name, CoachAssistant assistant) {
		this.name = name;
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
