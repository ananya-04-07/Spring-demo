package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HellospringApp {
    public static void main(String [] args)
    {
        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve beans from spring container
        coach ch = context.getBean("Mycoach",coach.class);
        coach ch1 = context.getBean("giveup",coach.class);
        //call method on beans
        System.out.println(ch.myperformance());
        System.out.println(ch1.myperformance());
        System.out.println(ch.getDailyForune());
        System.out.println(ch1.getDailyForune());
        //close the context
        context.close();




    }
}
