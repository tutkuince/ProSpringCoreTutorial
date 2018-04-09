package io.spring.tutorial.part03.stereotype.dao;

import org.springframework.stereotype.Repository;

import io.spring.tutorial.part03.stereotype.model.Person;

@Repository	// it is appropriate to use @Repository for DAO layer. 
public class PersonDAOImpl implements PersonDAO {
	@Override
	public void insertPerson(Person person) {
		System.out.println("PersonDAOImp#insertPerson(Person person)");
	}
}
