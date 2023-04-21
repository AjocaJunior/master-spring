package com.ajocasol.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ajocasol.springboot.learnjpaandhibernate.course.Course;

@Repository
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdcbTemplate;

	private static String INSERT_QUERY = 
			"""
			insert into course (id, name, author) values (?,?,?)
			""";
	private static String DELETE_QUERY =
			"""
			delete from course where id = ?
			""";
	private static String SELECT_QUERY =
			"""
			select * from course where id = ?
			""";
	
	
	public void insert(Course course) {
		springJdcbTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}
	
	public void deleteById(long id) {
		springJdcbTemplate.update(DELETE_QUERY, id);
	}

	public Course findById(long id) {
		//Result set to Bean => Row Mapper 
		return springJdcbTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class),id);
		
	}
}
