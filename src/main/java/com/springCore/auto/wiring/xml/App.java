package com.springCore.auto.wiring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Employees!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/auto/wiring/xml/autoConfig.xml");
        
        Employee emp = (Employee)context.getBean("emp1");
        
        System.out.println(emp);
    }
}
