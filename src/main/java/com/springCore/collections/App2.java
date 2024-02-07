package com.springCore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Employees!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/collections/collectionConfig.xml");
        
        Employees emp = (Employees)context.getBean("emp1");
        
        System.out.println(emp.getName());
        System.out.println(emp.getPhones());
        System.out.println(emp.getAddress());
        System.out.println(emp.getCourses());
    }
}
