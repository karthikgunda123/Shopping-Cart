package com.project.shoppingcart.services;

import com.project.shoppingcart.models.OrderRequest;
import com.project.shoppingcart.models.ProductOrder;
import org.springframework.data.domain.Page;

import java.util.List;

public interface OrderService {

	void saveOrder(Integer userid, OrderRequest orderRequest) throws Exception;
	
	List<ProductOrder> getOrdersByUser(Integer userId);
	
	ProductOrder updateOrderStatus(Integer id, String status);

	List<ProductOrder> getAllOrders();

    ProductOrder getOrdersByOrderId(String trim);

	Page<ProductOrder> getAllOrdersPagination(Integer pageNo, Integer pageSize);
}