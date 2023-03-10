package com.elegido.codes;

import org.apache.commons.lang3.time.StopWatch;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		StopWatch myStopWatch = new StopWatch();
		myStopWatch.start();
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		// Call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());

		// Close context
		context.close();
		myStopWatch.stop();
		System.out.println("Time: " + myStopWatch.getTime() + " millis");
	}

}
