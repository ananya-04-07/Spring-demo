package com.annotationspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainmet {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        coach ch = context.getBean("Mycoach",coach.class);
        System.out.println(ch.getDailyForune());
        System.out.println(ch.myperformance());
        context.close();
    }
}
