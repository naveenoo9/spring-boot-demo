package com.tutorials.service.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.tutorials.service.Coach;

@Service @Lazy
public class FootballCoach implements Coach {

	public FootballCoach() {
		System.out.println("Instantiating ----> " + getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		return "Football Coach Implementation";
	}

}
