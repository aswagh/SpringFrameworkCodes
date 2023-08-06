package com.spring_framework.SpringXmlConfigurations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring_framework.SpringXmlConfigurations.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student) applicationContext.getBean("student1");
        System.out.println(student1);
    
        Student student2 = (Student) applicationContext.getBean("student2");
        System.out.println(student2);
    }
}
