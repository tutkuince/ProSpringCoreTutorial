package io.spring.tutorial.part04.jdbc.dao;

import java.util.List;

import io.spring.tutorial.part04.jdbc.model.Person;

public interface PersonNamedJDBCDAO {
	public void insert(Person person);

	public Person getPersonById(int id);

	public List<Person> getAllPersons();

	public void update(Person person);

	public void delete(int id);
	
public void deleteAllPersons();
}
