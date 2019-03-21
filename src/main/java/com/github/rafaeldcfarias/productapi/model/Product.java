package com.github.rafaeldcfarias.productapi.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue
	private Long id;

	private String description;

	private String imageUrl;

	private BigDecimal price;

	public Product(String description, String imageUrl, BigDecimal price) {
		super();
		this.description = description;
		this.imageUrl = imageUrl;
		this.price = price;
	}

}
