package io.spring.tutorial.part04.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.spring.tutorial.part04.hibernate.model.Person;

@Repository("personDAOImpl")
public class PersonDAOImpl implements PersonDAO {

	// Native hibernate
	// JPA -> EntityManager, Hibernate -> SessionFactory
	@Autowired
	private SessionFactory sessionFactory;

	// public void setSessionFactory(SessionFactory sessionFactory) {
	// this.sessionFactory = sessionFactory;
	// }

	public Session getSession() {
		return sessionFactory.openSession();
	}

	@Override
	public void insertPerson(Person person) {
		Session session = getSession();
		Transaction transacion = session.beginTransaction();
		session.persist(person);
		transacion.commit();
		session.close();
	}
}
