package com.cg.spring.jpa.springdata.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.spring.jpa.springdata.bean.Product;

@Repository
public interface IProductRepo {
	
	public List<Product> getAllProducts();

	public void addProduct(String name, double price);

	public List<Product> searchByName(String name);
	
	public void delete(int id);
}
