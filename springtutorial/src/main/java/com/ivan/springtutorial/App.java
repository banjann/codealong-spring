package com.ivan.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
	  
	  //using xml based configuration
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("ApplicationContext.xml");
		 */
	  
	  //using annotation-based configuration
	  ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	  
	  //getting the bean from IoC container
	  Tire obj = (Tire) context.getBean("tire");
	  System.out.println(obj);
  }
}
