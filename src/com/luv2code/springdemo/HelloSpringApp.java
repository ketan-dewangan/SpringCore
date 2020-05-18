package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		
		// Retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);


		
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// let's call our new method's for fortune
		System.out.println(theCoach.getDailyFortune());
		
		
		// close the context
		context.close();

	}

}
