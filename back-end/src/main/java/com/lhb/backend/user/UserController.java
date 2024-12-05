package com.lhb.backend.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserService userService;

    //회원가입
    @PostMapping("/signup")
    public ResponseEntity singUp(@RequestBody User.Info user){
        return userService.createUser(user);
    }

    //이메일 사용 가능 여부
    @PostMapping("/check-email")
    public ResponseEntity checkEmail(@RequestBody User.UserEmail userEmail){
        return userService.isUsableEmail(userEmail);
    }
}
