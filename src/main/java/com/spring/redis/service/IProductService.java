package com.spring.redis.service;

import com.spring.redis.entity.Product;

public interface IProductService {

	public String saveProduct(Product prod);
	public Product findProductById(int pid)throws Exception;
}
