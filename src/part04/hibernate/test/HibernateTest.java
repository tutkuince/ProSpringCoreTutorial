package io.spring.tutorial.part04.hibernate.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.spring.tutorial.part04.hibernate.dao.PersonDAO;
import io.spring.tutorial.part04.hibernate.dao.PersonDAOImpl;
import io.spring.tutorial.part04.hibernate.model.Person;

public class HibernateTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("04.hibernate.xml");
		
		PersonDAO dao = context.getBean(PersonDAOImpl.class);
		dao.insertPerson(new Person("Tutku", "Ince", 1989));
		
		context.close();
	}
}
