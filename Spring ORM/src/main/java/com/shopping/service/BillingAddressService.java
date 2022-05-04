package com.shopping.service;

import com.shopping.model.BillingAddress;

public interface BillingAddressService {

	public void addBillingAddress(BillingAddress billingAddress);
	
	BillingAddress getBillingAddressbyId(long billingAddressId);
}
