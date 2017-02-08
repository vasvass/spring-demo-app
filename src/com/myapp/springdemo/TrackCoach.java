package com.myapp.springdemo;

/**
 * <p><i>Created on: 04/02/2017</i></p>
 *
 * @author vasvass
 */



public class TrackCoach implements Coach {

  private  FortuneService fortuneService;

  public TrackCoach() {


  }
  public TrackCoach(FortuneService fortuneService) {

        this.fortuneService = fortuneService;
  }

     @Override
     public String getDailyWorkout() {

         return "Run a hard 5k";
     }

    @Override
     public String getDailyFortune() {

        return "Just do it: " + fortuneService.getFortune();
    }

}
