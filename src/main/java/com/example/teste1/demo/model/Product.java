package com.example.teste1.demo.model;

import jakarta.persistence.*;
import lombok.*;

/**
 * Entidade Product minimalista.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Double price;
}
