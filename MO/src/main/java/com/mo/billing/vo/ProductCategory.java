package com.mo.billing.vo;

public enum ProductCategory {
	
	A("A"),
	B("B"),
	C("C");
	
	private String category;
	
	private ProductCategory(String category){
		this.category = category;
	}

	public String getCategory() {
		return category;
	}
	
}
