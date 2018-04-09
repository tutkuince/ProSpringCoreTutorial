package io.spring.tutorial.part03.javabased.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private String no;
	private String name;
	private String surname;
	
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
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

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", surname=" + surname + ", address=" + address + "]";
	}

}
