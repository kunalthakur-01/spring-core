package com.springCore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello friends!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/standalone/collections/aloneConfig.xml");
        
        Person emp = (Person)context.getBean("person1");
//        
        System.out.println(emp);
    }
}
