package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	private JdbcTemplate jdbcTemplate;
	private int customer_id;

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public boolean isValidCustomer(String username, String password) {
		try {
			String query = "select * from CustomerDetails where username=? and password=?";
			Customer customer = jdbcTemplate.queryForObject(query, new CustomerRowMapperImpl(), username, password);
			setCustomer_id(customer.getCustomer_id());
			if (username.equalsIgnoreCase(customer.getUsername()))
				return true;
			else
				return false;
		} catch (Exception e) {
			return false;
		}

	}

	public int addCustomer(Customer customer) {
		String query = "insert into CustomerDetails values (?,?,?,?)";
		int rows = jdbcTemplate.update(query, customer.getUsername(), customer.getPassword(), customer.getName(),
				customer.getMobile_number());
		return rows;
	}

	public int deleteCustomer(Customer customer) {
		String query = "delete from  CustomerDetails where customer_id=? ";
		int rows = jdbcTemplate.update(query, customer.getCustomer_id());
		return rows;
	}

	public int updateCustomer(Customer customer) {
		String query = "update CustomerDetails set username=?,password=?,name=?,mobile_number=? where customer_id=?";
		int rows = jdbcTemplate.update(query, customer.getUsername(), customer.getPassword(), customer.getName(),
				customer.getMobile_number(), customer.getCustomer_id());
		return rows;
	}

	public List<Customer> getCustomerById(Customer customer) {
		String query = "select *  from CustomerDetails where customer_id=?";
		Customer rows = jdbcTemplate.queryForObject(query, new CustomerRowMapperImpl(), customer.getCustomer_id());
		List<Customer> list = new ArrayList<Customer>();
		list.add(rows);
		return list;
	}

	public List<Customer> getAllCustomers() {
		String query = "select *  from CustomerDetails";
		List<Customer> list = jdbcTemplate.query(query, new CustomerRowMapperImpl());
		return list;
	}

}
