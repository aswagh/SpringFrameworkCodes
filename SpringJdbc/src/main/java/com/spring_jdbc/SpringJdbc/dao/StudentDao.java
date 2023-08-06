package com.spring_jdbc.SpringJdbc.dao;

import java.util.List;

import com.spring_jdbc.SpringJdbc.beans.Student;

public interface StudentDao {
	public int insert(Student student);
	public Student getStudent(int studentId);
	public List<Student> getStudents();
	
}
