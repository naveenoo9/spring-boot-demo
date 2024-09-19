package com.tutorials.service.impl;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.tutorials.service.Coach;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
/** 
 * @Service is a type of @Component that means the class is Service in terms of Business Layers 
 * */

@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE) /** Setting bean-scope for TennisCoatch to Prototype @author nyarragu */
public class TennisCoach implements Coach {

	public TennisCoach() {
		System.out.println("Instantiating ----> " + getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout() {
		return "TennisCoach Implementation";
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
