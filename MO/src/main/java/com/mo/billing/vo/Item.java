package com.mo.billing.vo;

import java.math.BigDecimal;
import java.util.List;

public class Item {
	
	private Product product;
	
	private int quantity;
	
	private List<Tax> taxes;
	
	
	
	public Item(Product product, int quantity, List<Tax> taxes) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.taxes = taxes;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public List<Tax> getTaxes() {
		return taxes;
	}

	public void setTaxes(List<Tax> taxes) {
		this.taxes = taxes;
	}

	public BigDecimal getTotalTaxOnItem() {
		BigDecimal totalTax = new BigDecimal(0);
		for(Tax tax : taxes){
			totalTax = totalTax.add(tax.calculateTax(product).multiply(new BigDecimal(quantity)));
		}
		return totalTax;
	}
	
	public BigDecimal getTotalPrice(){
		return product.getPrice().multiply(new BigDecimal(quantity));
	}
	
	public BigDecimal geSalePriceOfItem() {
		return getTotalPrice().add(getTotalTaxOnItem());
	}
	

}
