package com.vssolution.dscommerce.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vssolution.dscommerce.entities.Product;
import com.vssolution.dscommerce.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	/*
	 * @GetMapping public String teste() { return "Olá mundo!"; }
	 */
	@Autowired
	private ProductRepository repository;
	
	@GetMapping
	public String teste() {
		Optional<Product> result =  repository.findById(1L);
		Product product = result.get();
		return product.getName();
	}
	
		
}