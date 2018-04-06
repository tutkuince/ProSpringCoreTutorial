package io.spring.tutorial.part02.constructorinjection.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.spring.tutorial.part02.constructorinjection.model.ConstructorConfuse;
import io.spring.tutorial.part02.constructorinjection.model.Person;

public class TestConstructorInjection {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("02.constructor.injection.xml");
		
		Person prs1 = context.getBean("prs1", Person.class);
		Person prs2 = context.getBean("prs1", Person.class);
		
		System.out.println(prs1);
		
		System.out.println(prs1 == prs2);	// By default, Spring Beans are singleton.
		System.out.println(prs1.equals(prs2));
		
		Person prs3 = context.getBean("prs3", Person.class);
		System.out.println(prs3);
		
		Person prs4 = context.getBean("prs4", Person.class);
		System.out.println(prs4);
		
		ConstructorConfuse cc1 = context.getBean("cc1", ConstructorConfuse.class);
		System.out.println(cc1);
		
		ConstructorConfuse cc2 = context.getBean("cc2", ConstructorConfuse.class);
		System.out.println(cc2);
		
		context.close();
	}
}
