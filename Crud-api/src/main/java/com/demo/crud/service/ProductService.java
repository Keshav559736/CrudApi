package com.demo.crud.service;

import java.util.Optional;

import com.demo.crud.entity.Product;

public interface ProductService {
	
	public Product saveProduct(Product product);
	public Product updateProduct(Product product);
	public Optional<Product> getProductById(Long id);
	public void deleteProduct(Long id);
}
