package io.spring.tutorial.part04.jpaeclipselink.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import io.spring.tutorial.part04.jpaeclipselink.model.Person;

public class PersonDAOImpl implements PersonDAO {

	private EntityManager entityManager;
	EntityManagerFactory entityManagerFactory;

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManager = entityManagerFactory.createEntityManager();
	}

	@Override
	public void insertPerson(Person person) {
		entityManager.getTransaction().begin();
		entityManager.persist(person);
		entityManager.getTransaction().commit();
	}
}
