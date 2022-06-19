package com.example.demo.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductRepo;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productRepo;

	@Override
	public Iterable<Product> getAllProduct() {
		return productRepo.findAll();
	}

	@Override
	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}

	@Override
	public Optional<Product> getProduct(Integer p_id) {
		Optional<Product> product = productRepo.findById(p_id);
		return product;
	}

	@Override
	public void deleteProduct(Integer id) {

		

	}

}
