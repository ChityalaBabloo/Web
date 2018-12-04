package com.cg.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //Making it as controller
public class HelloController {
	
	//Mapping a client request to method
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String sayHello() {
		return "success";
	}
}
