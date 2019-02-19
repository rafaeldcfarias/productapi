package com.github.rafaeldcfarias.productapi.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Product {

	@Id
	private Long id;

	private String description;

	private String imageUrl;

	private BigDecimal price;
}
