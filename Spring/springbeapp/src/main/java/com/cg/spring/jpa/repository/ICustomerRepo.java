package com.cg.spring.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.spring.jpa.bean.Customer;

public interface ICustomerRepo extends CrudRepository<Customer, Integer> {

	
	
}
