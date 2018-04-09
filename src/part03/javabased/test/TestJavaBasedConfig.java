package io.spring.tutorial.part03.javabased.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.spring.tutorial.part03.javabased.config.SpringConfig;
import io.spring.tutorial.part03.javabased.model.Student;

public class TestJavaBasedConfig {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Student std = context.getBean(Student.class);
		System.out.println(std);
	}
}
