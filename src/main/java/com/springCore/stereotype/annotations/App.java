package com.springCore.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello friends!");

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springCore/stereotype/annotations/stereoConfig.xml");

		Student s = (Student) context.getBean("student");
		System.out.println(s);
		System.out.println(s.hashCode());
		System.out.println(s.getAddress().getClass().getName());              
		
	}
}
