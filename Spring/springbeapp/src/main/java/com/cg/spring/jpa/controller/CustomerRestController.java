package com.cg.spring.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.jpa.bean.Customer;
import com.cg.spring.jpa.service.ICustomerService;

@RestController
public class CustomerRestController {
	
	@Autowired
	ICustomerService service;
	
	@RequestMapping(value="/getall")
	public List<Customer> getAll() {
		return service.getAll();
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(@RequestBody Customer c) {
		service.add(c);
		return "ola, success";
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(@RequestBody Customer c) {
		service.update(c);
		return "ola, success";
	}
	
}
