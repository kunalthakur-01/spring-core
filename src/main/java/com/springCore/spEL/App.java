package com.springCore.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello friends!");

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springCore/spEL/spELConfig.xml");

		Demo d1 = (Demo) context.getBean("demo");
		System.out.println(d1);             
		
	}
}
