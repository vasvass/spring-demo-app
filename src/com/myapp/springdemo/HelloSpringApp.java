package com.myapp.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p><i>Created on: 05/02/2017</i></p>
 *
 * @author vasvass
 */
public class HelloSpringApp {


    public static void main(String[] args) {

          // load the spring configuration file
          ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

         // retrieve bean from the spring container
         Coach theCoach  = context.getBean("myCoach", Coach.class);

        // call methods of the bean
         System.out.println(theCoach.getDailyWorkout());

        // call our new method for fortune
         System.out.println(theCoach.getDailyFortune());


       // close the context
         context.close();
    }


}
