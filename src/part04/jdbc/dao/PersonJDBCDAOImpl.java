package io.spring.tutorial.part04.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import io.spring.tutorial.part04.jdbc.model.Person;

public class PersonJDBCDAOImpl implements PersonJDBCDAO {
	private DataSource dataSource;

	public PersonJDBCDAOImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	private final static String INSERT_PERSON = "insert into person(name, surname, birthYear) values(?, ?, ?)";

	@Override
	public void insert(Person person) {
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(INSERT_PERSON);
			pstmt.setString(1, person.getName());
			pstmt.setString(2, person.getSurname());
			pstmt.setInt(3, person.getBirthYear());

			pstmt.executeUpdate();
			conn.close();
			
			System.out.println("Person is inserted!");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
