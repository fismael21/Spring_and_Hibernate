package com.elegidocodes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//Read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Get the bean from the spring container
		//Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		//Call a method on the bean
		//System.out.println(tennisCoach.getDailyWorkout());
		//Call method to get the daily fortune
		//System.out.println(tennisCoach.getDailyFortune());
		
		//System.out.println("\n");
		
		Coach soccerCoach = context.getBean("soccerCoach", Coach.class);
		System.out.println(soccerCoach.getDailyWorkout());
		System.out.println(soccerCoach.getDailyFortune());
		
		//Close the context
		context.close();
		
	}

}
