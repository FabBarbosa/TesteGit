package com.example.Futurize.user;

public record UserReponseDTO(Long id, String nome, String email, String senha) {
    public UserReponseDTO(User user){
        this(user.getId(), user.getNome(), user.getEmail(), user.getSenha());
    }
}
