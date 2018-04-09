package io.spring.tutorial.part04.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import io.spring.tutorial.part04.jdbc.model.Person;

public class PersonRowMapper implements RowMapper<Person> {

	@Override
	public Person mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		
		String name = resultSet.getString("name");
		String surname = resultSet.getString("surname");
		int birthYear = resultSet.getInt("birthYear");
		
		Person person = new Person(name, surname, birthYear);		
		return person;
	}

}
