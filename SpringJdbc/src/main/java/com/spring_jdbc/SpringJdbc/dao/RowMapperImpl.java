package com.spring_jdbc.SpringJdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring_jdbc.SpringJdbc.beans.Student;

public class RowMapperImpl implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student = new Student(rs.getInt(1),rs.getString(2),rs.getString(3));
		
		return student;
	}


}
