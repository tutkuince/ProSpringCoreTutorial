package io.spring.tutorial.part04.jdbc.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.spring.tutorial.part04.jdbc.dao.PersonNamedJDBCDAO;
import io.spring.tutorial.part04.jdbc.dao.PersonNamedJDBCDAOImpl;
import io.spring.tutorial.part04.jdbc.model.Person;

public class PersonNamedJDBCDAOTest {
	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("04.jdbctemplatenamed.xml");

		PersonNamedJDBCDAO personDAO = ctx.getBean(PersonNamedJDBCDAOImpl.class);

		// create person object
		Person person = new Person("Tutku", "Ince", 1989);

		// insert
		personDAO.insert(person);

		// find
		personDAO.getPersonById(1);

		// update
		person.setName("Levent");
		personDAO.update(person);

		// delete
		personDAO.delete(1);

		Person person2 = new Person("James", "Gosling", 1955);
		Person person3 = new Person("Joshua", "Bloch", 1961);

		personDAO.insert(person2);
		personDAO.insert(person3);

		// getAllPersons
		personDAO.getAllPersons();

		// deleteAllPersons		
		personDAO.deleteAllPersons();
		
		((ClassPathXmlApplicationContext) ctx).close();

}
}
