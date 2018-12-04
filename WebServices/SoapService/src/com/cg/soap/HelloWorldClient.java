package com.cg.soap;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HelloWorldClient {

	public static void main(String[] args) throws MalformedURLException {

		URL u = new URL("http://localhost:7878/hs?WSDL");
		QName q = new QName("http://soap.cg.com/","HelloWorldImplService");
		Service s = Service.create(u,q);
		HelloWorld h = s.getPort(HelloWorld.class);
		System.out.println(h.sayHello());
	}
}
