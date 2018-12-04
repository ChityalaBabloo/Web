package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.bean.Product;

@Component
public class ProductRepoImpl implements IProductRepo {
	
	List<Product> list = new ArrayList();
	public List<Product> getAllProducts() {
		return list;
	}

	@Override
	public List<Product> searchById(int id) {
		List<Product>newlist = new ArrayList();
		for(Product p: list) {
			if(p.getId()==id)
			{
				newlist.add(p);
			}
		}
		return newlist;
	}

	@Override
	public void addProduct(String name, double price) {
		Product p = new Product();
		p.setId(list.size() + 1);
		p.setName(name);
		p.setPrice(price);
		list.add(p);// TODO Auto-generated method stub
	}

	@Override
	public void update(int id, String name, double price) {
		for(Product p: list) {
			if(p.getId()==id)
			{
				p.setName(name);
				p.setPrice(price);
			}
		}
		
	}
	
}
