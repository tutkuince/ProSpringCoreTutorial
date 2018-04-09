package io.spring.tutorial.part03.jsr330.service;

import javax.inject.Inject;
import javax.inject.Named;

import io.spring.tutorial.part03.jsr330.model.Person;
import io.spring.tutorial.part03.jsr330.dao.PersonDAO;


@Named
public class PersonServiceImpl implements PersonService {
	
	@Inject
	private PersonDAO personDAO;
	
	@Override
	public void insertPerson(Person person) {
		System.out.println("PersonServiceImpl#insertPerson(Person person)");
		
		//
		personDAO.insertPerson(person);
	}
}
