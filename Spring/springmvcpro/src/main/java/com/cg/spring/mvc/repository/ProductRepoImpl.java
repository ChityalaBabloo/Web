package com.cg.spring.mvc.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cg.spring.mvc.beans.Product;

@Component // If u want to wire the bean to another bean u should use the @component
			// annotation to the implemeted class.which creates instance to this bean
public class ProductRepoImpl implements IProductRepo {

	List<Product> list = new ArrayList();
	public List<Product> getAllProducts() {
		return list;
	}

	public void add(Product p) {
/*
		Product p1 = new Product();
		p1.setId(list.size() + 1);
		p1.setName("Iphone 10");
		p1.setPrice(9000);
		list.add(p1);

		Product p2 = new Product();
		p2.setId(list.size() + 1);
		p2.setName("Samsung Galxy Note 8");
		p2.setPrice(68000);
		list.add(p2);
*/		
		p.setId(list.size() + 1);
		list.add(p);
	}

	public List<Product> search(int id) {
		List<Product>newlist = new ArrayList();
		for(Product p: list) {
			if(p.getId()==id)
			{
				newlist.add(p);
			}
		}
		return newlist;
	}
}
