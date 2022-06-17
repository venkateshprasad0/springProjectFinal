package com.dao;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.model.Customer;

public class CustomerRowMapperImpl implements RowMapper<Customer> {

	public Customer mapRow(ResultSet rs, int arg1) throws SQLException {

		Customer customer = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getLong(5));
		return customer;
	}

}
