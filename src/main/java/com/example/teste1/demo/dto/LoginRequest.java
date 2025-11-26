package com.example.teste1.demo.dto;

import lombok.Data;

/**
 * DTO para login de usuário.
 */
@Data
public class LoginRequest {
    private String email;
    private String password;
}
