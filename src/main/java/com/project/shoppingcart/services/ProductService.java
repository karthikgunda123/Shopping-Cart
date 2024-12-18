package com.project.shoppingcart.services;

import com.project.shoppingcart.models.Product;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ProductService
{
    Product saveProduct(Product product);

    List<Product> getAllProducts();

    Boolean deleteProduct(Integer id);

    Product getProductById(Integer id);

    Product updateProduct(Product product, MultipartFile file);

    List<Product> getAllActiveProducts(String category);

    List<Product> searchProduct(String ch);
}
