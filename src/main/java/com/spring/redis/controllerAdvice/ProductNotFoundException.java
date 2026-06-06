package com.spring.redis.controllerAdvice;

public class ProductNotFoundException extends Exception{

	public ProductNotFoundException (String msg) {
		super(msg);
	}
}
