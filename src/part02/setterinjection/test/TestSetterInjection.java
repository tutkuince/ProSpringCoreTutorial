package io.spring.tutorial.part02.setterinjection.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.spring.tutorial.part02.setterinjection.model.Employee;

public class TestSetterInjection {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("02.setter.injection.xml");

		Employee emp1 = context.getBean("employee1", Employee.class);
		System.out.println(emp1);

		Employee emp2 = context.getBean("employee2", Employee.class);
		System.out.println(emp2);
		
		Employee emp3 = context.getBean("employee3", Employee.class);
		System.out.println(emp3);
		
		Employee emp4 = context.getBean("employee4", Employee.class);
		System.out.println(emp4);
		
		context.close();
	}
}
