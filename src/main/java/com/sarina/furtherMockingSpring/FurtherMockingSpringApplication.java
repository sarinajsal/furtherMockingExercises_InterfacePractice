package com.sarina.furtherMockingSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FurtherMockingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FurtherMockingSpringApplication.class, args);
	}
	Person me = new Person();

	PersonDAO personDAOInstance = new PersonDataAccessLayer();


	PersonService personService = new PersonService(personDAOInstance);
}
