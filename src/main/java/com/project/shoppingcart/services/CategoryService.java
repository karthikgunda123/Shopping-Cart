package com.project.shoppingcart.services;

import com.project.shoppingcart.models.Category;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CategoryService {
    Category saveCategory(Category category);

    Boolean existCategory(String name);

    List<Category> getAllCategory();

    Boolean deleteCategory(int id);

    Category getCategoryById(int id);

    List<Category> getAllActiveCategory();

    Page<Category> getAllCategoriesPagination(Integer pageNo, Integer pageSize);
}
