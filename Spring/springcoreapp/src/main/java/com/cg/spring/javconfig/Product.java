package com.cg.spring.javconfig;

public class Product {

	private String productName;
	private double productPrice;

	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String productName, double d) {
		super();
		this.productName = productName;
		this.productPrice = d;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productPrice=" + productPrice + "]";
	}
}
