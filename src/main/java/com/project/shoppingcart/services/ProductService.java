package com.project.shoppingcart.services;

import com.project.shoppingcart.models.Product;
import org.springframework.data.domain.Page;
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

    Page<Product> getAllActiveProductPagination(Integer pageNo, Integer pageSize, String category);

    Page<Product> searchProductPagination(Integer pageNo, Integer pageSize, String ch);

    Page<Product> getAllProductsPagination(Integer pageNo, Integer pageSize);

    Page<Product> searchActiveProductPagination(Integer pageNo, Integer pageSize, String category, String ch);
}
