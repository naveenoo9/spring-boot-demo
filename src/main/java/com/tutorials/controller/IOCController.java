package com.tutorials.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorials.service.Coach;

@RestController
@RequestMapping(path="/ioc")
public class IOCController {
	
	private Coach coach, coach2;
	
	/**
	 * Example for Constructor Auto-wiring using qualifier to specify which dependency to be injected in case of ambiguity
	 *  */
	@Autowired
	public IOCController(@Qualifier(value = "tennisCoach") Coach theCoach, Coach scndCoach) {
		coach = theCoach;
		coach2 = scndCoach;
	}
	
	/**	
	 * Setter Injection through auto-wired, setter injection takes precedence over constructor injection
	 * @param theCoach
	 */
	@Autowired
	public void setCoach(@Qualifier(value = "swimCoach") Coach theCoach)	{
		coach=theCoach;
	}
	
	@GetMapping("/getCoach")
	public String getCoach()	{
		
		return coach.getDailyWorkout();
	}
	
	@GetMapping(path="/checkSingleton")
	public String checkForSingleton()	{
		return "Comparing for singleton [coach(" + coach + ") == coach2(" + coach2 + " )]: " + (coach == coach2);
	}

}
