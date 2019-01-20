package com.luv2code.springdemo;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Kicking a ball";
	}

	@Override
	public String getDailyFortune() {
	
		return "Just Do it " + fortuneService.getFortune();
	}

}
