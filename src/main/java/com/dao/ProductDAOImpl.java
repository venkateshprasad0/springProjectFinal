package com.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.model.Product;

public class ProductDAOImpl implements ProductDAO {
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Product product) {
		// TODO Auto-generated method stub
		String query = "insert into product values (?,?,?)";
		int row = this.jdbcTemplate.update(query,product.getPid(),product.getPname(),product.getPprice());
		return row;
	}

	public int updateProduct(Product product) {
		// TODO Auto-generated method stub
		String query = "update product set pname = ?, pprice = ? where pid = ? ";
		int row = this.jdbcTemplate.update(query, product.getPname() , product.getPprice() , product.getPid());
		System.out.println("updated");
		return row;
	}

	public int deleteProduct(Product product) {
		String sql = "DELETE FROM product where pid = ?";
		int row = this.jdbcTemplate.update(sql, product.getPid());
		return row;
	}

	public List<Product> getProduct(int pid) {
		// TODO Auto-generated method stub
		String query = "select * from product where pid = ?";
		List<Product> list = this.jdbcTemplate.query(query, new RowMapperImpl(),pid);
		return list;
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		String query  = "select * from product";
		List<Product> list  =  this.jdbcTemplate.query(query, new RowMapperImpl());
		return list;
	}

	
}
