package com.example.teste1.demo.dto;

import lombok.Data;

/**
 * DTO para criação de produto.
 */
@Data
public class ProductRequest {
    private String title;
    private Double price;
}
