package com.cg.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.spring.mvc.beans.Employee;

@Controller
public class EmployeeController {
	
	@RequestMapping(value="/add")
	public ModelAndView add() {
		ModelAndView mv = new ModelAndView("addEmployee");
		mv.addObject("command", new Employee());
		return mv;
	}
}
