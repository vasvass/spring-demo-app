package com.myapp.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p><i>Created on: 08/02/2017</i></p>
 *
 * @author vasvass
 */

public class SetterDemoApp {


  public static void main (String[] args) {

     // load the spring configuration class
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

     // retrieve bean from spring container
     SkateboardCoach theCoach = context.getBean("mySkateboardCoach", SkateboardCoach.class);

     // call methods on the beam
     System.out.println(theCoach.getDailyWorkout());

     System.out.println(theCoach.getDailyFortune());

     // call new methods to get the literal values
     System.out.println(theCoach.getEmailAdress());
     System.out.println(theCoach.getTeam());

    // close the context
    context.close();
  }


}
