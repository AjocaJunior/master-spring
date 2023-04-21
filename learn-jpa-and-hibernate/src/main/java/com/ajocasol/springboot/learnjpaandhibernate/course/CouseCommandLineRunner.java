package com.ajocasol.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ajocasol.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.ajocasol.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.ajocasol.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;


@Component
public class CouseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override 
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(1,"Learn AWS SpringDataJPA","ajocasolutions"));
		repository.save(new Course(2,"Learn DevOps SpringDataJPA","in28minutes"));
		repository.save(new Course(3,"Learn Azure SpringDataJPA","in28minutes"));
		repository.deleteById(2l);
		
		System.out.println(repository.findById(3l));
		System.out.println(repository.findByAuthor("in28minutes"));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
	}

}
