package com.cg.spring.jpa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.spring.jpa.bean.Customer;

@Service
public interface ICustomerService {
	
	public List<Customer> getAll();
	
	public void add(Customer c);

	public void update(Customer c);
}
