package com.springCore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {
	public static void main(String[] args) {
		System.out.println("Hello Person!");

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springCore/constructorInjection/ciConfig.xml");

		Person p = (Person)context.getBean("Person1");

		System.out.println(p);
	}
}
