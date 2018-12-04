package com.cg.spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.spring.mvc.beans.Product;
import com.cg.spring.mvc.repository.IProductRepo;

@Component
public class IproductServiceImpl implements IProductService {

	@Autowired //Not creating object. Wiring the bean to this reference variable called repo.
	IProductRepo repo;
	public List<Product> getAllProducts() {
		return repo.getAllProducts();
	}
	
	public void add(Product p) {
		repo.add(p);		
	}
	public List<Product> searchById(int id) {
		return repo.search(id);
	}

}
