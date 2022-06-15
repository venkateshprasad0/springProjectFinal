package com.dao;

import java.util.List;

import com.model.Product;

public interface ProductDAO {
	
	public int insert(Product product);
	public int updateProduct(Product product);
	public int deleteProduct(Product product);
	public Product getProduct(int pid);
	public List<Product> getAllProducts();

}
