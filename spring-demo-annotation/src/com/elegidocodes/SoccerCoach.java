package com.elegidocodes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public SoccerCoach() {
		System.out.println(">>SoccerCoach: inside default constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "You have to run faster!";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	/*
	@Autowired
	public void setDailyFortune(FortuneService fortuneService) {
		System.out.println(">>SoccerCoach: inside setter method constructor");
		this.fortuneService = fortuneService;
	}

	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">>SoccerCoach: inside doSomeCrazyStuff method constructor");
		this.fortuneService = fortuneService;
	}
	*/
	
}
