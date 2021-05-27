package com.ivan.springtutorial;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	public void drive() {
		System.out.println("It's driving..");
	}
	
	public String getName() {
		return "this is a car";
	}
}
