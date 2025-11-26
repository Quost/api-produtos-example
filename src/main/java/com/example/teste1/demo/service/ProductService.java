package com.example.teste1.demo.service;

import com.example.teste1.demo.dto.ProductRequest;
import com.example.teste1.demo.dto.ProductResponse;
import com.example.teste1.demo.model.Product;
import com.example.teste1.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Serviço de produto: listar e criar produtos.
 */
@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    /**
     * Lista todos os produtos.
     */
    public List<ProductResponse> findAll() {
        return productRepository.findAll().stream()
                .map(p -> new ProductResponse(p.getId(), p.getTitle(), p.getPrice()))
                .collect(Collectors.toList());
    }

    /**
     * Cria um novo produto.
     */
    public ProductResponse create(ProductRequest request) {
        Product product = Product.builder()
                .title(request.getTitle())
                .price(request.getPrice())
                .build();
        Product saved = productRepository.save(product);
        return new ProductResponse(saved.getId(), saved.getTitle(), saved.getPrice());
    }
}
