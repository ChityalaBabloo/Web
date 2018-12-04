package com.cg.spring.jpa.springdata;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.jpa.springdata.bean.Product;
import com.cg.spring.jpa.springdata.service.IProductService;

@RestController
@ComponentScan(basePackages="com.cg.spring.jpa.springdata")
public class ProductController {
	
	@Autowired
	IProductService service;
	
	@RequestMapping("/getall")
	public List<Product> getAllProducts() {
		return service.getAllProducts();
	}
	
	@RequestMapping("/add/{name}/{price}")
	public List<Product> addProuct(@PathVariable("name") String name,@PathVariable("price") double price) {
		service.addProduct(name,price);
		return service.getAllProducts();
	}
	
	@RequestMapping("/searchById/{name}")
	public List<Product> searchById(@PathVariable("name") String name) {
		return service.searchByName(name);
	}
	@RequestMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		service.delete(id);
	}
}
