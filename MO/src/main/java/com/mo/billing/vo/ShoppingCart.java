package com.mo.billing.vo;

import java.math.BigDecimal;
import java.util.List;

public class ShoppingCart {
	
	private List<Item> itemList;
	
	public ShoppingCart(List<Item> itemList) {
		super();
		this.itemList = itemList;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	
	public BigDecimal getTotalTax(){
		BigDecimal totalTax = new BigDecimal(0);
		for(Item item : itemList){
			totalTax = totalTax.add(item.getTotalTaxOnItem());
		}
		return totalTax;
	}
	
	public BigDecimal getTotalPrice(){
		BigDecimal totalPrice = new BigDecimal(0);
		for(Item item : itemList){
			totalPrice = totalPrice.add(item.getTotalPrice());
		}
		return totalPrice;
	}
	
	public BigDecimal getTotalCartPrice(){
		BigDecimal salePrice = new BigDecimal(0);
		for(Item item : itemList){
			salePrice = salePrice.add(item.geSalePriceOfItem());
		}
		return salePrice;
	}

}
