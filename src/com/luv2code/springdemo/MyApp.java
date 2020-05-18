package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		Coach theCoach = new BaseballCoach(null);
		
		System.out.println(theCoach.getDailyWorkout());
	}
}
