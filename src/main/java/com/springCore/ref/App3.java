package com.springCore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.collections.Employees;

public class App3 {

	public static void main(String[] args) {
		System.out.println("Hello Employees!");

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springCore/ref/refConfig.xml");
		
		A a = (A)context.getBean("aRef");
		
		System.out.println(a);
		System.out.println(a.getX());
        System.out.println(a.getB());
        System.out.println(a.getB().getY());

	}

}
