package com.project.shoppingcart.repositories;

import com.project.shoppingcart.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Integer> {

	Cart findByProductIdAndUserId(Integer productId, Integer userId);

	Integer countByUserId(Integer userId);

	List<Cart> findByUserId(Integer userId);
}