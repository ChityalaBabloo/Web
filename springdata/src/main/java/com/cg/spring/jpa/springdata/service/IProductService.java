package com.cg.spring.jpa.springdata.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.spring.jpa.springdata.bean.Product;

@Service
public interface IProductService {
	
	public List<Product> getAllProducts();

	public void addProduct(String name, double price);
	
	public List<Product> searchByName(String name);

	public void delete(int id);
}
