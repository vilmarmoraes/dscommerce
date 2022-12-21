package com.vssolution.dscommerce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vssolution.dscommerce.dto.ProductDTO;
import com.vssolution.dscommerce.entities.Product;
import com.vssolution.dscommerce.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	

	@Transactional(readOnly = true)
	public ProductDTO findById(Long id) {
//		Optional<Product> result = repository.findById(id);
//		Product product = result.get();
//		ProductDTO dto = new ProductDTO(product);
//		return dto;
		
		Product product = repository.findById(id).get();
		return new ProductDTO(product);
	}
}
