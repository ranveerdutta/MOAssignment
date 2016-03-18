package com.mo.billing.service;

import com.mo.billing.vo.ShoppingCart;

public interface BillGenerator {
	void generateBill(ShoppingCart cart);
}
