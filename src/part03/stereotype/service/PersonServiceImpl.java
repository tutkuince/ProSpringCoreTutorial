package io.spring.tutorial.part03.stereotype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.spring.tutorial.part03.stereotype.dao.PersonDAO;
import io.spring.tutorial.part03.stereotype.model.Person;

@Service
// Default name is personServiceImpl or we can declare @Service(value="PersonService")
public class PersonServiceImpl implements PersonService {
	
	@Autowired	// not required for setter/getter or constructor(reflection)
	private PersonDAO personDAO;
	
	@Override
	public void insertPerson(Person person) {
		System.out.println("PersonServiceImpl#insertPerson(Person person)");
		
		//
		personDAO.insertPerson(person);
	}
}
