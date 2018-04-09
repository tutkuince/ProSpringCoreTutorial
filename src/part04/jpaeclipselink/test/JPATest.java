package io.spring.tutorial.part04.jpaeclipselink.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.spring.tutorial.part04.jpaeclipselink.dao.PersonDAO;
import io.spring.tutorial.part04.jpaeclipselink.dao.PersonDAOImpl;
import io.spring.tutorial.part04.jpaeclipselink.model.Person;

public class JPATest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("04.jpa.xml");
		
		PersonDAO dao = context.getBean(PersonDAOImpl.class);
		
		dao.insertPerson(new Person("Tutku", "Ince", "1989"));
		
		context.close();
	}
}
