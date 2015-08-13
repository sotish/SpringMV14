package com.sat.dao;

import java.sql.Connection;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import model.Student;

public class StudentDaoImpl implements StudentDao {

	private DataSource ds;
	private JdbcTemplate jdbcTemplate;

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	public void insert(Student student) {
		String sql = "INSERT INTO Student "
				+ "(id, firstName,lastName. age, email) VALUES (?, ?, ?, ?, ?)";
		// Connection conn = null;
		jdbcTemplate.update(sql, student.getId(), student.getFirstName(),
				student.getLastName(), student.getAge(), student.getEmail());
	}

	public Student findById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Student> getAllStudent() {
		return jdbcTemplate.query("select * from Student",
				new BeanPropertyRowMapper<Student>(Student.class));

	}

	// to get list of first names

	public List<String> getFNames() {

		return jdbcTemplate.queryForList("select firstName from Student",
				String.class);
	}

	// to get number of rows

	public int getCount() {
		return jdbcTemplate.queryForObject("select * from student",
				Integer.class);
	}

}
