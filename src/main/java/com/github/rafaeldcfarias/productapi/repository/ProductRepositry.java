package com.github.rafaeldcfarias.productapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.rafaeldcfarias.productapi.model.Product;

public interface ProductRepositry extends JpaRepository<Product, Long> {

}
