package com.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.model.Product;

@Configuration
public class JavaConfigurationClass {
	
	@Bean(name  = {"ds"})
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		ds.setUrl("jdbc:sqlserver://localhost;databaseName=testDB;instanceName=SQLEXPRESS");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
		
	}
	
	@Bean(name  = {"jdbcTemp"})
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate  = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
		
	}
	
	@Bean(name = {"pDAO"})
	public ProductDAO getProductDAO() {
		ProductDAOImpl pDAO  = new ProductDAOImpl();
		pDAO.setJdbcTemplate(getTemplate());
		return pDAO;
	}
}
