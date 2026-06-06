package com.spring.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.redis.entity.Product;
import com.spring.redis.service.IProductService;

@RestController
@RequestMapping("/product-api")
public class ProductOperationController {
	
	@Autowired
	private IProductService service;

	@PostMapping("/save")
	public ResponseEntity<String> saveProduct(@RequestBody Product prod){
		String msg = service.saveProduct(prod);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable(name="id") int pid) throws Exception{
		Product prod = service.findProductById(pid);
		System.out.println(prod);
		return new ResponseEntity<Product>(prod,HttpStatus.OK);
	}
}
