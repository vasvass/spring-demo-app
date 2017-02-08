package com.myapp.springdemo;

/**
 * <p><i>Created on: 06/02/2017</i></p>
 *
 * @author vasvass
 */

public class KendoCoach implements Coach {

  //define a private field for the dependency
  private FortuneService fortuneService;

  //define a constructor for dependency injection
  public KendoCoach (FortuneService theFortuneService) {

     fortuneService = theFortuneService;
  }

  @Override
  public String getDailyWorkout() {

      return "Do 500 suburi, then practise footwork";
  }

  @Override
  public String getDailyFortune() {

    return fortuneService.getFortune();
  }


}
