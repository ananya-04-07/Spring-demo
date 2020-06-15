package com.tutorialpackage;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.SocketOption;

public class mainclass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        helloone obj = (helloone) context.getBean("helloone");
        helloone obj2 = (helloone) context.getBean("helloone");
        System.out.println(obj + "      " + obj2);
        boolean result = obj == obj2;
        System.out.println(result);
        obj.getMessage();
        obj2.getMessage();
        context.close();

    }
}
