package com.cg.spring.mvc.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.spring.mvc.beans.Product;

@Repository //Telling spring application that this class is going to be act as repository
public interface IProductRepo {
	
	List<Product> getAllProducts();
	
	void add(Product p);

	List<Product> search(int id);
}
