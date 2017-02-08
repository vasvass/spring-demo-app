package com.myapp.springdemo;

/**
 * <p><i>Created on: 06/02/2017</i></p>
 *
 * @author vasvass
 */
public class FortuneServiceImpl implements FortuneService {


  @Override
  public String getFortune() {

      return "Today is your lucky day";
  }

}
