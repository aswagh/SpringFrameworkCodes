package com.spring_jdbc.SpringJdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring_jdbc.SpringJdbc.beans.Student;
import com.spring_jdbc.SpringJdbc.configuration.JdbcConfig;
import com.spring_jdbc.SpringJdbc.dao.StudentDaoService;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//        StudentDaoService studentDaoService=(StudentDaoService) applicationContext.getBean("StudentDaoService");
//      studentDaoService.insert(new Student(5,"Sangam","Singh"));

        
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDaoService studentDaoService = (StudentDaoService) applicationContext.getBean("getStudentDaoService");
        
        Student student = studentDaoService.getStudent(3);
        System.out.println(student);
        
        List<Student> students = studentDaoService.getStudents();
        
        for(Student stud : students)
        	System.out.println(stud);
//        String query = "insert into Student (id,first_name,last_name) values (?,?,?)";
//        jdbcTemplate.update(query,3,"Ravi","Sharshri");
        
        
    }
}
