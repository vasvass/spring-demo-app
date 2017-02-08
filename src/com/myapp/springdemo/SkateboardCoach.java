package com.myapp.springdemo;

/**
 * <p><i>Created on: 08/02/2017</i></p>
 *
 * @author vasvass
 */
public class SkateboardCoach implements Coach {

  private FortuneService fortuneService;

  // creatiion of no argument constructor
  public SkateboardCoach() {
     System.out.println("SkateboardCoach: inside no-arg constructor");
  }

  // setter method
  public void setFortuneService (FortuneService fortuneService) {
     System.out.println("SkateboardCoach: inside the setter method");
     this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
     return "Practice ollie and flip tricks, both normal and switch";
  }

  @Override
  public String getDailyFortune() {

       return fortuneService.getFortune();
  }


}
