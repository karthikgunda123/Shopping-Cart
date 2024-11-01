package com.project.shoppingcart.services;

import com.project.shoppingcart.models.Category;
import com.project.shoppingcart.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class CategoryServiceImplementation implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category saveCategory(Category category)
    {
        return categoryRepository.save(category);
    }

    @Override
    public Boolean existCategory(String name)
    {
        return categoryRepository.existsByName(name);
    }

    @Override
    public List<Category> getAllCategory()
    {
        return categoryRepository.findAll();
    }

    @Override
    public Boolean deleteCategory(int id)
    {
        Category category = categoryRepository.findById(id).orElse(null);

        if (!ObjectUtils.isEmpty(category))
        {
            categoryRepository.delete(category);
            return true;
        }

        return false;
    }

    @Override
    public Category getCategoryById(int id) {
        return categoryRepository.findById(id).orElse(null);
    }

}
