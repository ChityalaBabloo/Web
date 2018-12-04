package com.cg.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		
		//spring providing a core container called ApplicationContext which is an interface
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//injecting bean using (Employee)context.getBean("emp"); or
		Employee e1 = context.getBean(Employee.class);
		System.out.println(e1);
		
		Manager m1 = context.getBean(Manager.class);
		System.out.println(m1);
		
		context.close();
	}
}
