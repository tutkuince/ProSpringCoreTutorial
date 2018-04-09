package io.spring.tutorial.part03.autowired.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.spring.tutorial.part03.autowired.model.Employee;

public class TestAutowiring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("03.autowired.xml");

		Employee emp1 = ctx.getBean("emp1", Employee.class);
		System.out.println(emp1);

		ctx.close();
	}
}
