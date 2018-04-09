package io.spring.tutorial.part04.jdbc.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.spring.tutorial.part04.jdbc.dao.PersonJDBCDAO;
import io.spring.tutorial.part04.jdbc.dao.PersonJDBCDAOImpl;
import io.spring.tutorial.part04.jdbc.model.Person;

public class SpringJDBCTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("04.jdbc.xml");

		PersonJDBCDAO dao = context.getBean(PersonJDBCDAOImpl.class);
		Person prs = new Person("Tutku", "Ince", 1989);

		dao.insert(prs);

		context.close();
	}
}
