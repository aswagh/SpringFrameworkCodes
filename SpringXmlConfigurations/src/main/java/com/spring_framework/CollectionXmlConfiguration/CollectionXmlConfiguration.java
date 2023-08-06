package com.spring_framework.CollectionXmlConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring_framework.SpringXmlConfigurations.beans.Student;

public class CollectionXmlConfiguration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("CollectionConfig.xml");
		// Wont need to explicitly create student object
		// IOC container will take care of it's life Cycle
		//		Student stud = (Student) applicationContext.getBean("studentref");
		Employee empSetterInjection = (Employee) applicationContext.getBean("emp");
		System.out.println(empSetterInjection);

	
		Employee empConstructorInjection = (Employee) applicationContext.getBean("emp_constructor_args");
		System.out.println(empConstructorInjection);
}

}
