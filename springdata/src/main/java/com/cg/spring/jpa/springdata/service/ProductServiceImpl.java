package com.cg.spring.jpa.springdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.spring.jpa.springdata.bean.Product;
import com.cg.spring.jpa.springdata.repository.IProductRepo;

@Component
public class ProductServiceImpl implements IProductService{

	
	@Autowired
	IProductRepo repo;

	@Override
	public List<Product> getAllProducts() {
		return repo.getAllProducts();
	}

	@Override
	public void addProduct(String name, double price) {
		// TODO Auto-generated method stub
		repo.addProduct(name,price);
		
	}

	@Override
	public List<Product> searchByName(String name) {
		// TODO Auto-generated method stub
		return repo.searchByName(name);
	}

	@Override
	public void delete(int id) {
		repo.delete(id);
		
	}
	
	
}
