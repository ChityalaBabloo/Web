package com.cg.spring.jpa.springdata.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.spring.jpa.springdata.bean.Product;

@Component
@Transactional
public class ProductRepoImpl implements IProductRepo {
	
	List <Product> list;
	
	
	@Autowired
	EntityManager em;
	@Override
	public List<Product> getAllProducts() {
		Query q = em.createQuery("from Product");
		list = q.getResultList();
		return list;
	}
	@Override
	public void addProduct(String name, double price) {
		Product p = new Product();
		p.setId(list.size()+1);
		p.setName(name);
		p.setPrice(price);
		em.persist(p);
	}
	//Search by Id
	public List<Product> searchByName(String name) {
		List<Product> newList = new ArrayList();
		for(Product p:list) {
			if(p.getName().equals(name)) {
			/*	Product foundProduct = em.find(Product.class, id);*/
				newList.add(p);
			}
		}
		return newList;
	}

	@Override
	public void delete(int id) {
		Product foundProduct = em.find(Product.class, id);
		em.remove(foundProduct);	
	}
}
