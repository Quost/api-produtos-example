package com.example.teste1.demo.dto;

import lombok.Data;

/**
 * DTO para registro de usuário.
 */
@Data
public class RegisterRequest {
    private String name;
    private String email;
    private String password;
}
