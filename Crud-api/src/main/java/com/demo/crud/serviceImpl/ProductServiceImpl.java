package com.demo.crud.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.crud.entity.Product;
import com.demo.crud.repository.ProductRepository;
import com.demo.crud.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		 Product existingProduct = productRepository.findById(product.getId()).orElse(null);
		  if (existingProduct != null) {
		    existingProduct.setName(product.getName());
		    existingProduct.setId(product.getId());
		    existingProduct.setCustomers(product.getCustomers());
		  }
		  return productRepository.save(existingProduct);
	}

	@Override
	public Optional<Product> getProductById(Long id) {
		 return productRepository.findById(id);
	}

	@Override
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
		
	}

}
