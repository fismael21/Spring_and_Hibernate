package com.elegidocodes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//Default Bean ID = tennisCoach
//Spring will automatically register this bean
//@Component("thatSillyCoach") //Annotation
@Component //Default
public class TennisCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	/*Constructor for injections
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backend volley";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
