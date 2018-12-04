package com.cg.spring.core.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Customer {
	
	private String firstname;
	private String lastname;
	private Address addr;
	
	List<Address> list;
	Set<Address> set;
	Map<Integer,Address> map;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String firstname, String lastname, Address addr, List<Address> list, Set<Address> set,
			Map<Integer, Address> map) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.addr = addr;
		this.list = list;
		this.set = set;
		this.map = map;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public Address getAddr() {
		return addr;
	}


	public void setAddr(Address addr) {
		this.addr = addr;
	}


	public List<Address> getList() {
		return list;
	}


	public void setList(List<Address> list) {
		this.list = list;
	}


	public Set<Address> getSet() {
		return set;
	}


	public void setSet(Set<Address> set) {
		this.set = set;
	}
	
	public Map<Integer, Address> getMap() {
		return map;
	}


	public void setMap(Map<Integer, Address> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", addr=" + addr + ",\nlist=" + list
				+ ",\nset=" + set + ",\nmap=" + map + "]";
	}
}
