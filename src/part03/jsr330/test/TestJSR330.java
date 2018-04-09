package io.spring.tutorial.part03.jsr330.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.spring.tutorial.part03.stereotype.model.Person;
import io.spring.tutorial.part03.stereotype.service.PersonService;
import io.spring.tutorial.part03.stereotype.service.PersonServiceImpl;

public class TestJSR330 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("03.jsr330.xml");
		
		PersonService personService = ctx.getBean("personServiceImpl", PersonServiceImpl.class);
		
		Person person = new Person();
		person.setName("Tutku");
		person.setSurname("Ince");
		
		personService.insertPerson(person);
		
		ctx.close();
	}
}
