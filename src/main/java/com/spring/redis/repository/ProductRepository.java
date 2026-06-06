package com.spring.redis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.redis.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
