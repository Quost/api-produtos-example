package com.example.teste1.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * DTO de resposta de autenticação (token JWT).
 */
@Data
@AllArgsConstructor
public class AuthResponse {
    private String token;
}
