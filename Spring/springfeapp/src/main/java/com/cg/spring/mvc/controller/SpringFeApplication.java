package com.cg.spring.mvc.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cg.spring.mvc")
public class SpringFeApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringFeApplication.class, args);
	}
}
