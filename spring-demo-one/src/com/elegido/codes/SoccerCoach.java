package com.elegido.codes;

public class SoccerCoach implements Coach {

	private FortuneService fortuneService;

	public SoccerCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Messi or Cr7?";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
