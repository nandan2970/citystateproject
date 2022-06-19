package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.Product;

public interface ProductService {

	public Iterable<Product> getAllProduct();

	public Product saveProduct(Product product);

	public Optional<Product> getProduct(Integer p_id);

	public void deleteProduct(Integer id);

}
