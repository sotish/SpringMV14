package com.sat.main;

import java.net.URL;
import java.util.List;

import model.Student;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.sat.bean.myBean;
import com.sat.dao.StudentDao;
import com.sat.dao.StudentDaoImpl;

@SuppressWarnings("deprecation")
public class App {

	public static void main(String[] args) {
		 //URL resourceUrl= App.class.getResource("application-config.xml");


		@SuppressWarnings("resource")
		ApplicationContext ctx= new ClassPathXmlApplicationContext("application-config.xml");

StudentDao studentDao = ctx.getBean("studentDao", StudentDao.class);

Student student = new Student();
 student.setId(1);

 studentDao.insert(student);




		/*DataSource ds = (DataSource) ctx.getBean("dataSource");
		SimpleJdbcTemplate jdbcTemplate = new SimpleJdbcTemplate(ds);

		jdbcTemplate.update(sql, args);
		SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(StudentDao);*/


 myBean  mb =   (myBean) ctx.getBean("myBean");
 System.out.print("hello");

	}

}
