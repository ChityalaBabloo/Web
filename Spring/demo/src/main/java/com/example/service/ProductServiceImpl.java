package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.bean.Product;
import com.example.repository.IProductRepo;

@Component
public class ProductServiceImpl implements IProductService{
	
	@Autowired
	IProductRepo repo;
	public List<Product> getAllProducts() {
		return repo.getAllProducts();
	}

	public List<Product> searchById(int id) {
		return repo.searchById(id);
	}
	
	public void addProduct(String name, double price) {
		repo.addProduct(name, price);
	}

	@Override
	public void update(int id, String name, double price) {
		repo.update(id, name, price);
		
	}
}
