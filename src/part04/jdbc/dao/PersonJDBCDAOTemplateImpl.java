package io.spring.tutorial.part04.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import io.spring.tutorial.part04.jdbc.model.Person;

public class PersonJDBCDAOTemplateImpl implements PersonJDBCDAOTemplate {

	private final static String INSERT_PERSON = "insert into person(name, surname, birthYear) values(?, ?, ?)";

	private JdbcTemplate jdbcTemplate;

	public PersonJDBCDAOTemplateImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insert(Person person) {
		Object[] insertParams = new Object[] { person.getName(), person.getSurname(), person.getBirthYear() };
		
		jdbcTemplate.update(INSERT_PERSON, insertParams);
		System.out.println("Person inserted!");
	}
}
