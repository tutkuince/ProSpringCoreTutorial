package io.spring.tutorial.part03.jsr330.dao;

import javax.inject.Named;

import io.spring.tutorial.part03.jsr330.model.Person;

@Named
public class PersonDAOImpl implements PersonDAO {
	@Override
	public void insertPerson(Person person) {
		System.out.println("PersonDAOImp#insertPerson(Person person)");
	}
}
