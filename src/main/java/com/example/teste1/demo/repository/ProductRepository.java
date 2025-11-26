package com.example.teste1.demo.repository;

import com.example.teste1.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositório de produtos.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
