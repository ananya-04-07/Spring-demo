package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class newmain {
    public static void main(String [] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        coach ch = context.getBean("cric",coach.class);
        System.out.println(ch.getDailyForune());
        System.out.println(ch.myperformance());

    }
}
