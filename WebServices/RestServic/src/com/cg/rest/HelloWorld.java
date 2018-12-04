package com.cg.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorld {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/sayText")
	public String sayHelloAsText() {
		return "Hello as Text";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/sayHtml")
	public String sayHelloAsHtml() {
		return "<h1>Hello Bab</h1>";
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	@Path("/sayXml")
	public String sayHelloAsXml() {
		return "<?xml version='1.0'?><name>Capgemini</name>";
	}
}
