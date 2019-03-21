package com.github.rafaeldcfarias.productapi;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.github.rafaeldcfarias.productapi.model.Product;
import com.github.rafaeldcfarias.productapi.repository.ProductRepositry;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final ProductRepositry productRepositry;

	@Autowired
	public DatabaseLoader(ProductRepositry productRepositry) {
		this.productRepositry = productRepositry;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.productRepositry.save(new Product("Baby monitor", "baby_monitor", BigDecimal.valueOf(10)));
	}
}