package com.myapp.springdemo;

/**
 * <p><i>Created on: 04/02/2017</i></p>
 *
 * @author vasvass
 */



public class BaseballCoach implements Coach {

  @Override
  public String getDailyWorkout() {

      return "Spend 30 minutes on practice";
  }

  @Override
  public String getDailyFortune() {

      return "Today your lucky day";
  }


}
