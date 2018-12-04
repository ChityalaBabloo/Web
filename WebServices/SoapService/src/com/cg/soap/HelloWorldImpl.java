package com.cg.soap;

import javax.jws.WebService;

@WebService(endpointInterface="com.cg.soap.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	
	@Override
	public String sayHello() {
		return "Hello, Gd Mrng!";
	}

}
