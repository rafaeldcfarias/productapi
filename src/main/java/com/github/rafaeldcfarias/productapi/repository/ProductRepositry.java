package com.github.rafaeldcfarias.productapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.github.rafaeldcfarias.productapi.model.Product;

public interface ProductRepositry extends CrudRepository<Product, Long> {

}
