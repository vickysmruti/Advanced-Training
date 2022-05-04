package com.shopping.service;

import java.util.List;

import com.shopping.model.Cart;
import com.shopping.model.CustomerOrder;

public interface CustomerOrderService {

	public void addCustomerOrder(CustomerOrder customerOrder);

	

	double getCustomerOrderGrandTotal(long cartId);
	
	CustomerOrder getCustomerOrderBycart(Cart cart);
	
	List<CustomerOrder> getAllCustomerOrder();
	
	
	public CustomerOrder getCustomerOrderById(long customerOrderId);
	
	public void deleteCustomerOrderById(long customerOrderId);
	
}
