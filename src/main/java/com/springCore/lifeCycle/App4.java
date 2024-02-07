package com.springCore.lifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4 {

	public static void main(String[] args) {
		System.out.println("Hello Food!");

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/lifeCycle/config.xml");

//		To call destroy mehtod
		context.registerShutdownHook();
		
//		implementing bean using XML
		Cake c = (Cake) context.getBean("c1");
		System.out.println(c);

		System.out.println("**********************************************************");
		
//		implementing bean using interfaces
		Pepsi p = (Pepsi) context.getBean("p1");
		System.out.println(p);
		
		System.out.println("**********************************************************");

//		implementing bean using annotations
		Course course = (Course) context.getBean("course1");
		System.out.println(course);
	}

}
