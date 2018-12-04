package com.cg.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontController {
	
	@RequestMapping(value="/getall", method=RequestMethod.GET)
	public ModelAndView getAllCustomer() {
		ModelAndView mv = new ModelAndView("showall");
		RestTemplate template = new RestTemplate();
		List<Customer> list = template.getForObject("http://localhost:9395/getall", ArrayList.class);
		mv.addObject("customers",list);
		return mv;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView add() {
		ModelAndView mv = new ModelAndView("add_customer");
		mv.addObject("command",new Customer());
		return mv;
	}
	
	@RequestMapping(value="/addCustomer", method=RequestMethod.POST)
	public String add(Customer c) {
		//ModelAndView mv = new ModelAndView("add_customer");
		RestTemplate temp = new RestTemplate();
		temp.postForObject("http://localhost:9395/add",c,String.class);//will go for backend controller with add
		return "redirect:/getall";
	}
	@RequestMapping("/update")
	public ModelAndView update(@RequestParam("id") int id) {
		ModelAndView mv=new ModelAndView("update_customer");
		mv.addObject("id", new Integer(id));
		mv.addObject("command",new Customer());
		return mv;
	}
	@RequestMapping(value="/updateCustomer", method=RequestMethod.POST)
	public String update(Customer c) {
		//ModelAndView mv = new ModelAndView("update_customer");
		RestTemplate temp = new RestTemplate();
		temp.postForObject("http://localhost:9395/update",c,String.class);//will go for backend controller with add
		return "redirect:/getall";
	}
}
