package com.elegido.codes;

public class BaseballCoach implements Coach {

	// Define a private field for dependency
	private FortuneService fortuneService;

	// Define a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// Use my fortuneService to get a fortune

		return fortuneService.getFortune();
	}
}
