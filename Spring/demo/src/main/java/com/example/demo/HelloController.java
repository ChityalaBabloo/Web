package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Product;
import com.example.service.IProductService;


@RestController
@ComponentScan(basePackages="com.example")
public class HelloController {
	
	@Autowired
	IProductService service;
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello";
	}
	
	@RequestMapping("/helloy")
	public String sayHelloy() {
		return "Hello,you are good";
	}
	
	@RequestMapping("/getall")
	public List<Product> getAllProducts() {
		return service.getAllProducts();
	}
	
	@RequestMapping("/searchById/{id}")
	public List<Product> searchById(@PathVariable("id") int id) {
		return service.searchById(id);
	}
	
	@RequestMapping("/add/{name}/{price}")
	public List<Product> addProuct(@PathVariable("name") String name,@PathVariable("price") double price) {
		service.addProduct(name,price);
		return service.getAllProducts();
	}
	
	@RequestMapping("/update/{id}/{name}/{price}")
	public List<Product> update(@PathVariable("id") int id, @PathVariable("name") String name,@PathVariable("price") double price) {
		service.update(id,name,price);
		return service.getAllProducts();
		
	}
}
