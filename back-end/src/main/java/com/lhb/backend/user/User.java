package com.lhb.backend.user;

import lombok.Builder;
import lombok.Getter;

@Getter
public class User {
    private String email;
    private String username;
    private String password;

    @Builder
    public User(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }
}
