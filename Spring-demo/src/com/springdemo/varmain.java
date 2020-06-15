package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class varmain {
    public static void main(String [] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("newapp.xml");
        variablesetter vr = context.getBean("varset" ,variablesetter.class);
        vr.getdetails();
    }
}
