package com.sat.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Student;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowmapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

		 Student student = new Student();
		 student.setId(rs.getInt(1));
		 student.setFirstName(rs.getString(2));
		 student.setLastName(rs.getString(3));
		 student.setAge(rs.getInt(4));
		 student.setEmail(rs.getString(5));

		return student;
	}

}
