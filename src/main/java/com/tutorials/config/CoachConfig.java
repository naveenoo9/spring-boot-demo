package com.tutorials.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tutorials.service.impl.SwimCoach;

@Configuration
public class CoachConfig {

	@Bean
	public SwimCoach swimCoach()	{
		System.out.println("Requested for SwimCoach");
		return new SwimCoach();	}
}
