package com.cg.soap;

import javax.xml.ws.Endpoint;

public class HelloWorldPublish {

	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:7878/hs", new HelloWorldImpl());
		
	}

}
