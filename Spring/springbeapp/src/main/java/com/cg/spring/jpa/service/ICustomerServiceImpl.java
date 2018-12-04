package com.cg.spring.jpa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.spring.jpa.bean.Customer;
import com.cg.spring.jpa.repository.ICustomerRepo;

@Component
public class ICustomerServiceImpl implements ICustomerService{
	
	@Autowired
	ICustomerRepo repo;
	
	
	
	@Override
	public List<Customer> getAll() {
		List<Customer> list = new ArrayList();
		repo.findAll().forEach(list::add);
		return list;
	}

	@Override
	public void add(Customer c) {
		repo.save(c);
	}

	@Override
	public void update(Customer c) {
		Optional<Customer> c1 = repo.findById(c.getId());
		if(c1.isPresent())
		{
			Customer c2=c1.get();
			c2.setCity(c.getCity());
			c2.setCname(c.getCname());
			c2.setMailId(c.getMailId());
			repo.save(c2);
		}
	}

}
