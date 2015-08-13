package com.sat.dao;



import java.util.List;

import javax.sql.DataSource;



import model.Student;

public interface StudentDao {


	public  void insert(Student student);
	public Student findById(int id);
	public List<Student> getAllStudent();
	public List<String> getFNames();
	public int getCount ();



}


