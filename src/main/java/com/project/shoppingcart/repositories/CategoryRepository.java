package com.project.shoppingcart.repositories;

import com.project.shoppingcart.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    Boolean existsByName(String name);

    List<Category> findByActiveTrue();
}
