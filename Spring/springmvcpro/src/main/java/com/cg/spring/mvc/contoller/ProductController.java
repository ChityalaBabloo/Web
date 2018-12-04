package com.cg.spring.mvc.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.spring.mvc.beans.Product;
import com.cg.spring.mvc.service.IProductService;

@Controller
public class ProductController {
	
	@Autowired
	IProductService service;
	
	
	@RequestMapping(value="/getall",method=RequestMethod.GET)
	public ModelAndView getAllProduct() {
		
		
		ModelAndView mv = new ModelAndView("showall");//it is showall.jsp file specified in spring.xml
		mv.addObject("products", service.getAllProducts());
		return mv;
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView addProduct() {
		// TODO Auto-generated method stub
		
		ModelAndView mv = new ModelAndView("add");
		mv.addObject("command", new Product());//command is a property of spring web mvc.
		return mv;
	}
	
	@RequestMapping(value="/addProduct",method=RequestMethod.POST)
	public String add(Product p) {
		// TODO Auto-generated method stub
		service.add(p);
		return "redirect:/getall";
	}
	@RequestMapping(value="/searchProduct",method=RequestMethod.POST)
	public ModelAndView search(@RequestParam("id")int id) {
		
		ModelAndView mv = new ModelAndView("searchById");//it is showall.jsp file specified in spring.xml
		mv.addObject("products", service.searchById(id));
		return mv;
	}
}
