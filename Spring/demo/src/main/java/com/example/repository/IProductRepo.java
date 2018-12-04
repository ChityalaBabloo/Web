package com.example.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bean.Product;

@Repository
public interface IProductRepo {
	
	public List<Product> getAllProducts();
	public List<Product> searchById(int id);
	public void addProduct(String name, double price);
	public void update(int id, String name, double price);
}
