package com.elegido.codes;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it! " + fortuneService.getFortune();
	}

	// Add an init method
	public void doMyStartupStuff() {
		System.out.println("Trackcoach: inside method doMyStartupStuff");
	}

	// Add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("Trackcoach: inside method doMyCleanupStuff");
	}
}
