package io.spring.tutorial.part03.stereotype.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.spring.tutorial.part03.jsr330.model.Person;
import io.spring.tutorial.part03.jsr330.service.PersonService;
import io.spring.tutorial.part03.jsr330.service.PersonServiceImpl;

public class TestStereotype {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("03.stereotype.xml");
		
		PersonService personService = ctx.getBean("personServiceImpl", PersonServiceImpl.class);
		
		Person person = new Person();
		person.setName("Tutku");
		person.setSurname("Ince");
		
		personService.insertPerson(person);
		
		ctx.close();
	}
}
