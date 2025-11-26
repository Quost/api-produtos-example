package com.example.teste1.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * DTO de resposta de produto.
 */
@Data
@AllArgsConstructor
public class ProductResponse {
    private Long id;
    private String title;
    private Double price;
}
