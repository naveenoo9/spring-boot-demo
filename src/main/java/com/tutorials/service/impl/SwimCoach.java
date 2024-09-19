package com.tutorials.service.impl;

import com.tutorials.service.Coach;

public class SwimCoach implements Coach {

	public SwimCoach() {
		System.out.println("Instantiating ----> " + getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout() {
		return "SwimCoach Implementation";
	}

}
