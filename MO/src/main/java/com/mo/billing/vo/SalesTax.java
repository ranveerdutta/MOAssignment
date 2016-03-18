package com.mo.billing.vo;

import java.math.BigDecimal;

public class SalesTax implements Tax{

	@Override
	public BigDecimal calculateTax(Product product) {
		if(ProductCategory.A.equals(product.getProductCategory())){
			return product.getPrice().multiply(new BigDecimal(0.1));
		}else if(ProductCategory.B.equals(product.getProductCategory())){
			return product.getPrice().multiply(new BigDecimal(0.2));
		}else if(ProductCategory.C.equals(product.getProductCategory())){
			return new BigDecimal(0);
		}else{
			throw new RuntimeException("Unsupported product category: " + product.getProductCategory().getCategory());
		}
	}

	@Override
	public String getTaxName() {
		return "Sales Tax";
	}

}
