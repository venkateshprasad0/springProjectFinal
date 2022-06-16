package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.model.Admin;

public class AdminRowMapperImpl implements RowMapper {

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Admin admin = new Admin(rs.getInt(1), rs.getString(2), rs.getString(3));
		return admin;
	}

}
