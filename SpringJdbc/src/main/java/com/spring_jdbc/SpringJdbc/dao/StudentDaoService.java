package com.spring_jdbc.SpringJdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring_jdbc.SpringJdbc.beans.Student;

public class StudentDaoService implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int insert(Student student) {
			String query = "insert into Student (id, first_name,last_name) values (?,?,?)";
			int i = jdbcTemplate.update(query,student.getId(),student.getFirstName(),student.getLastName());
		return i;
	}
	
	@Override
	public Student getStudent(int studentId) {
		String query = "select * from Student where id = ?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}

	@Override
	public List<Student> getStudents() {
		String query = "select * from student";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		List<Student> students = this.jdbcTemplate.query(query, rowMapper);
		return students;
	}
}
