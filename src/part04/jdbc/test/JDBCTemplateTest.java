package io.spring.tutorial.part04.jdbc.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.spring.tutorial.part04.jdbc.dao.PersonJDBCDAOTemplate;
import io.spring.tutorial.part04.jdbc.dao.PersonJDBCDAOTemplateImpl;
import io.spring.tutorial.part04.jdbc.model.Person;

public class JDBCTemplateTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("04.jdbctemplate.xml");
		PersonJDBCDAOTemplate dao = context.getBean(PersonJDBCDAOTemplateImpl.class);

		Person person = new Person("Emin", "Köklü", 1990);
		dao.insert(person);
		context.close();
	}
}
