package com.ajocasol.springboot.learnjpaandhibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajocasol.springboot.learnjpaandhibernate.course.Course;

//Interface que extende JpaRepository para esta chamar a entidade e o tipo de dado do ID
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{

	//Definir métodos de pesquisa na DB, neste caso pesquisa por Author	
	List<Course>findByAuthor(String author);
}
