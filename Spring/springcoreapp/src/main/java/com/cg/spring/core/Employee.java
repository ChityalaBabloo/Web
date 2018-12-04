package com.cg.spring.core;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {

	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	//constructor type injection....go to manager.java for see setter type injection
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public void afterPropertiesSet() throws Exception {
		
		System.out.println("init() for employee Bean");
	}
	
	public void destroy() throws Exception {
		
		System.out.println("destroy() for employee Bean");
	}
	@PreDestroy
	public void preDestroy() {
		System.out.println("preDestroy() for employee bean");
	}
	@PostConstruct
	public void postConstruct() {
		System.out.println("postConstruct() foe employee bean");
	}
	public void init() {
		System.out.println("init method calling from xml");
	}
	public void destroyBean() {
		System.out.println("destroy method calling from xml");
	}
}
