package com.project.shoppingcart.controllers;

import com.project.shoppingcart.models.Category;
import com.project.shoppingcart.models.Product;
import com.project.shoppingcart.services.CategoryService;
import com.project.shoppingcart.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String indexPage(){
        return "index";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/register")
    public String registerPage(){
        return "register";
    }

    @GetMapping("/products")
    public String productsPage(Model model){
        List<Category> categories = categoryService.getAllActiveCategory();
        List<Product> products = productService.getAllActiveProducts();
        model.addAttribute("categories", categories);
        model.addAttribute("products", products);
        return "product";
    }

    @GetMapping("/product")
    public String productPage(){
        return "view_product";
    }
}
