package com.sat.main;


import model.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sat.dao.StudentDaoImpl;



public class App {

	public static void main(String[] args) {


		 //URL resourceUrl= App.class.getResource("application-config.xml");


		@SuppressWarnings("resource")
		ApplicationContext ctx= new ClassPathXmlApplicationContext("application-config.xml");

StudentDaoImpl studentDao = ctx.getBean("studentDao", StudentDaoImpl.class);


		Student student = new Student();
 student.setId(1);

 studentDao.insert(student);




		/*DataSource ds = (DataSource) ctx.getBean("dataSource");
		SimpleJdbcTemplate jdbcTemplate = new SimpleJdbcTemplate(ds);

		jdbcTemplate.update(sql, args);
		SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(StudentDao);*/


 myBean  mb =   (myBean) ctx.getBean("myBean");
 System.out.print("hello"+mb.getName());

	}

}
