package com.mo.billing.vo;

import java.math.BigDecimal;

public interface Tax {
	
	BigDecimal calculateTax(Product product);
	
	String getTaxName();

}
