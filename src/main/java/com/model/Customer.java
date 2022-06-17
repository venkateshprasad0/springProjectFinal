package com.model;

public class Customer {

	private int customer_id;
	private String username;
	private String password;
	private String name;
	private long mobile_number;

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}

	public Customer(int customer_id, String username, String password, String name, long mobile_number) {
		super();
		this.customer_id = customer_id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.mobile_number = mobile_number;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", username=" + username + ", password=" + password + ", name="
				+ name + ", mobile_number=" + mobile_number + "]";
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
