package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import com.model.Admin;

public class AdminDaoImpl implements AdminDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate1() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public boolean isValidAdmin(String username, String password) {
		try {
			String query = "select * from AdminDetails where username=? and password=?";
			Admin admin = jdbcTemplate.queryForObject(query, new AdminRowMapperImpl(), username, password);
			if (username.equalsIgnoreCase(admin.getUsername()))
				return true;
			else
				return false;
		} catch (Exception e) {
			return false;
		}

	}
}
