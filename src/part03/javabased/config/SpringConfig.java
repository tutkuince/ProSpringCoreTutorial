package io.spring.tutorial.part03.javabased.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import io.spring.tutorial.part03.javabased.model.Address;
import io.spring.tutorial.part03.javabased.model.Student;

@Configuration
@PropertySource(value = "student.properties")
@ComponentScan(basePackages = "io.spring.tutorial.part03.javabased.model")
public class SpringConfig {

	@Autowired // inject
	private Environment enviroment;

	@Bean(value = "studentBean")
	public Student getStudent() {
		Student std = new Student();
		// std.setNo("3210");
		// std.setName("Tutku");
		// std.setSurname("Ince");

		std.setNo(enviroment.getProperty("no"));
		std.setName(enviroment.getProperty("name"));
		std.setSurname(enviroment.getProperty("surname"));
		return std;
	}

	@Bean(value = "addressBean")
	public Address getAddress() {
		Address address = new Address();
		address.setCity("Izmir");
		address.setCountry("Turkey");
		return address;
	}
}
