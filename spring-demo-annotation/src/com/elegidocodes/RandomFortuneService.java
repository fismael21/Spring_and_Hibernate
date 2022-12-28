package com.elegidocodes;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//Create an array of strings
	
	private String[] data = {
			"Value 1",
			"Value 2",
			"Value 3"
	};
	
	//Create a random number generator
	private Random myRandom = new Random();
	
	
	
	@Override
	public String getFortune() {
		//Pick a random string from the array
		
		int myIndex = myRandom.nextInt(data.length);
		
		String theFortune = data[myIndex];
		
		return theFortune;
	}

}
