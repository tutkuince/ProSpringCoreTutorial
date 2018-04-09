package io.spring.tutorial.part04.jdbc.dao;

import io.spring.tutorial.part04.jdbc.model.Person;

public interface PersonJDBCDAOTemplate {
	public void insert(Person person);
}
