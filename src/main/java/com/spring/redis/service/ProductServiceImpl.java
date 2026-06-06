package com.spring.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.redis.controllerAdvice.ProductNotFoundException;
import com.spring.redis.entity.Product;
import com.spring.redis.repository.ProductRepository;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private ProductRepository productRepo;
	
	@Override
	public String saveProduct(Product prod) {
		Integer id = productRepo.save(prod).getPid();
		return "Product added habing product id : "+id;
	}

	@Override
	public Product findProductById(int pid)throws Exception {
		Product prod = productRepo.findById(pid).orElseThrow(()->new ProductNotFoundException("Product Not found having pid : "+pid));
		return prod;
	}

}
