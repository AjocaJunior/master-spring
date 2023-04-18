package com.ajocasol.springframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//With record with don't need get and set method	
//record is like a class
record Person(String name, int age, Address address) {
	
}
record Address(String firstLine, String city) {
	
}

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Ajoca";
	}

	@Bean
	public int age() {
		return 25;
	}
	
	@Bean
	public Person person() {
		var person = new Person("Sheila",21, new Address("São Damaso","Matola"));
		return person;
	}
	
	
	//Relationship between Beans
	@Bean
	public Person person2MethodCall() {
		var person = new Person(name(), age(), address());//name, age
		return person;
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) { //name, age, address2
		var person = new Person(name, age, address3);//name, age
		return person;
	}
	
	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) { //name, age, address
		var person = new Person(name, age, address);//name, age
		return person;
	}
	
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) { //name, age, address
		var person = new Person(name, age, address);//name, age
		return person;
	}
	
	
	//Name the Bean with @Bean (name = "thename")
	@Bean(name = "address2")
	@Primary
	public Address address() {
		return new Address("Fomento Sial","Matola");
	}
	
	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("Nkobe","Matola");
	}
}
