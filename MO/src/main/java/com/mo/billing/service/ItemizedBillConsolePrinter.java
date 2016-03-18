package com.mo.billing.service;

import java.math.BigDecimal;
import java.text.NumberFormat;

import com.mo.billing.vo.Item;
import com.mo.billing.vo.ShoppingCart;

public class ItemizedBillConsolePrinter implements BillGenerator{

	@Override
	public void generateBill(ShoppingCart cart) {
		
		System.out.println("product name      quantity     price       tax     sale price");
		for(Item item : cart.getItemList()){
			System.out.println(item.getProduct().getName() + "   " + item.getQuantity() + "    "  + 
					formatAmount(item.getTotalPrice()) + "  " +  formatAmount(item.getTotalTaxOnItem()) + "   " + formatAmount(item.geSalePriceOfItem()));
		}
		
		System.out.println("Total Amount payable: " + formatAmount(cart.getTotalCartPrice()));
	}
	
	private String formatAmount(BigDecimal amount){
		return NumberFormat.getCurrencyInstance().format(amount);
	}

}
