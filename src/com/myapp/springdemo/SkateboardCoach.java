package com.myapp.springdemo;

/**
 * <p><i>Created on: 08/02/2017</i></p>
 *
 * @author vasvass
 */


public class SkateboardCoach implements Coach {

  private FortuneService fortuneService;

  // add new fields for emailAddress and team
   private  String emailAddress;
   private  String team;

  // creation of no argument constructor
  public SkateboardCoach() {
     System.out.println("SkateboardCoach: inside no-arg constructor");
  }

  // getter for emailAddress
  public String getEmailAdress() {

      return  emailAddress;
  }

  // setter for emailAddress
  public void setEmailAddress(String emailAddress) {
    System.out.println("SkateboardCoach: inside setter method - setEmailAddress");
     this.emailAddress = emailAddress;
  }

  //getter for team
  public String getTeam() {

     return  team;
  }

  // setter for team
  public void setTeam(String team) {
    System.out.println("SkateboardCoach: inside setter method - setTeam");
     this.team = team;
  }

  // setter method
  public void setFortuneService (FortuneService fortuneService) {
     System.out.println("SkateboardCoach: inside the setter method - FortuneService");
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
