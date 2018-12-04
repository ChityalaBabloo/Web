package com.cg.spring.javconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.cg.spring.javconfig")
public class ProductConfiguration {
	
	@Bean
	public Product getProduct() {
		
		//Product p = new Product("iphone",44999.00);constructor based
		//now let's see setter based
		Product p = new Product();
		p.setProductName("Alopath");
		p.setProductPrice(9999.00);
		return p;
	}
}
