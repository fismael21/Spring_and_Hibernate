package com.elegido.codes;

public class CriketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	// Create a no-arg constructor
	public CriketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}

	// Create setters methods for injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	// Creating getters methods
	public String getEmailAddress() {
		System.out.println("CricketCoach: inside getter method - getEmailAddress");
		return emailAddress;
	}

	public String getTeam() {
		System.out.println("CricketCoach: inside getter method - getTeam");
		return team;
	}

	// -----------------------------------------------------

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
