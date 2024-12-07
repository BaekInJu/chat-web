package com.lhb.backend.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


public class User {
    @Getter
    @Setter
    public static class Info {
        private String email;
        private String username;
        private String password;
    }

    //이메일 사용 가능 여부 dto
    @Getter
    @Setter
    public static class UserEmail {
        private String email;
    }

    //로그인 요청 dto
    @Getter
    @Setter
    public static class UserLogin {
        private String email;
        private String password;
    }
}
