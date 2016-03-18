package com.mo.billing.vo;

import java.math.BigDecimal;

public class Product {
	
	private String name;
	
	private BigDecimal price;
	
	private ProductCategory productCategory;
	
	

	public Product(String name, BigDecimal price,
			ProductCategory productCategory) {
		super();
		this.name = name;
		this.price = price;
		this.productCategory = productCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}
	
	

}
