package com.project.shoppingcart.services;

import com.project.shoppingcart.models.OrderRequest;
import com.project.shoppingcart.models.ProductOrder;

import java.util.List;

public interface OrderService {

	void saveOrder(Integer userid, OrderRequest orderRequest);
	
	List<ProductOrder> getOrdersByUser(Integer userId);
	
	Boolean updateOrderStatus(Integer id, String status);

}