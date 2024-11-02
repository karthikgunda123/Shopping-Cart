package com.project.shoppingcart.repositories;

import com.project.shoppingcart.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByActiveTrue();

    List<Product> findByCategory(String category);
}
