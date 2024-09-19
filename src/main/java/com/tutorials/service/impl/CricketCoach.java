package com.tutorials.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.tutorials.service.Coach;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component @Primary
public class CricketCoach implements Coach {
	
	
	public CricketCoach() {
		System.out.println("Instantiating ----> " + getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		return "Cricket Coach Implementation";
	}
	
	@PostConstruct
	public void postConstruct()	{
		System.out.println("postConstruct for " + getClass().getSimpleName());
	}
	
	@PreDestroy
	public void preDestroy()	{
		System.out.println("preDestroy for " + getClass().getSimpleName());
	}

}
