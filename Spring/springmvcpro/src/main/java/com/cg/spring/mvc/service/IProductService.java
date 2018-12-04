package com.cg.spring.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.spring.mvc.beans.Product;

@Service //This is going to produce service fort our controller
public interface IProductService {
	
	List<Product> getAllProducts();
	
	void add(Product p);

	List<Product> searchById(int id);
}
