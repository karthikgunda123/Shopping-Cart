package com.project.shoppingcart.services;

import com.project.shoppingcart.models.Category;

import java.util.List;

public interface CategoryService {
    Category saveCategory(Category category);

    Boolean existCategory(String name);

    List<Category> getAllCategory();

    Boolean deleteCategory(int id);

    Category getCategoryById(int id);
}
