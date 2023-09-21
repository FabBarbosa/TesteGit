package com.example.Futurize.user;

public record UserReponseDTO(Long id, String title, String image, Integer price) {
    public UserReponseDTO(User user){
        this(user.getId(), user.getTitle(), user.getImage(), user.getPrice());
    }
}
