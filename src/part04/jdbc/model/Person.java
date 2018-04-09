package io.spring.tutorial.part04.jdbc.model;

public class Person {
	private int id;
	private String name;
	private String surname;
	private int birthYear;

	public Person(String name, String surname, int birthYear) {
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", surname=" + surname + ", birthYear=" + birthYear + "]";
	}

}
