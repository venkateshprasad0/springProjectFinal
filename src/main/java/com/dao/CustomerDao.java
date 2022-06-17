package com.dao;

import java.util.List;

import com.model.Customer;

public interface CustomerDao {

	public boolean isValidCustomer(String username, String password);
	public int addCustomer(Customer customer);
	public int deleteCustomer(Customer customer);
	public int updateCustomer(Customer customer);
	public List<Customer> getCustomerById(Customer customer);
	public List<Customer> getAllCustomers();
}
