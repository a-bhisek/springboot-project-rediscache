package com.spring.redis.controllerAdvice;

@SuppressWarnings("serial")
public class ProductNotFoundException extends Exception{

	public ProductNotFoundException (String msg) {
		super(msg);
	}
}
