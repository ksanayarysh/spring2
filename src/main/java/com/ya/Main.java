package com.ya;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("n");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout()) ;
    }
}
