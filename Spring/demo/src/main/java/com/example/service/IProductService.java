package com.example.service;

import java.util.List;

import com.example.bean.Product;

public interface IProductService {
	
	public List<Product> getAllProducts();
	public List<Product> searchById(int id);
	public void addProduct(String name, double price);
	public void update(int id, String name, double price);
}
