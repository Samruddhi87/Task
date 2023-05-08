package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductService {
	 Product createProduct(Product product);
	    List<Product> getAllProducts();
	    Product getProductById(Long id);
	    void deleteProduct(Long id);
}
