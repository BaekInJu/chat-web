package com.lhb.backend.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
public class User {
    private String email;
    private String username;
    private Long password;

    @Builder
    public User(String email, String username, Long password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    @Getter
    @Setter
    public static class UserEmail {
        private String email;
    }
}
