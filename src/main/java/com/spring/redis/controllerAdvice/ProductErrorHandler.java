package com.spring.redis.controllerAdvice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.spring.redis.entity.ErrorDetails;

@RestControllerAdvice
public class ProductErrorHandler {

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ErrorDetails> handelProductNotFound(ProductNotFoundException pex){
		System.out.println("ProductErrorHandler.handelProductNotFound()");
		ErrorDetails error = new ErrorDetails( LocalDateTime.now(), pex.getMessage(), "404 Product Not Found");
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handelAllProblems(Exception e){
		System.out.println("ProductErrorHandler.handelAllProblems()");
		ErrorDetails error = new ErrorDetails(LocalDateTime.now(), e.getMessage(), "Problem In Execution");
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
