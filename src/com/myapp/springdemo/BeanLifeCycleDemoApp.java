package com.myapp.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p><i>Created on: 11/02/2017</i></p>
 *
 * @author vasvass
 */
public class BeanLifeCycleDemoApp {


  public static void main(String[] args) {


    // load the spring configuration file
    ClassPathXmlApplicationContext context =
      new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

    // retrieve bean from spring container
    Coach theCoach = context.getBean("myCoach", Coach.class);


    System.out.println(theCoach.getDailyWorkout());

    context.close();

  }
}
