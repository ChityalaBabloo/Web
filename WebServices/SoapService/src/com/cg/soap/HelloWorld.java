package com.cg.soap;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService//declaring our interface as web service
@SOAPBinding(style=Style.DOCUMENT)//declaring our service as document.or u can also use rpc
//But preferred one is document.
//----In case of document, request and response is sent as document/i/e/, it creates an instance and stores the data and sends
//But, in case of rpc it will send individual property.Remote procedure call(rpc)
public interface HelloWorld {

	public String sayHello();
	
}
