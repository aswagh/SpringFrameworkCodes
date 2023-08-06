package com.spring_jdbc.SpringJdbc.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring_jdbc.SpringJdbc.dao.StudentDaoService;

@Configuration
public class JdbcConfig {

		@Bean
		public DataSource getDataSource() {
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			dataSource.setUrl("jdbc:mysql://localhost:3306/demoDb");
			dataSource.setUsername("atul");
			dataSource.setPassword("guru");;
			return dataSource;			
		}
		
		@Bean
		public JdbcTemplate getJdbcTemplate() {
			JdbcTemplate jdbcTemplate =new JdbcTemplate();
			jdbcTemplate.setDataSource(getDataSource());
			return jdbcTemplate;
		}
		
		@Bean
		public StudentDaoService getStudentDaoService() {
			JdbcTemplate jdbcTemplate = getJdbcTemplate();
			StudentDaoService studentDaoService = new StudentDaoService();
			studentDaoService.setJdbcTemplate(jdbcTemplate);
			return studentDaoService;
		}
}
