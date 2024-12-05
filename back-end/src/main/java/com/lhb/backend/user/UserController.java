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

    @PostMapping("/signup")
    public void singUp(@RequestBody User user){
        userService.createUser(user);
    }

    @PostMapping("/check-email")
    public ResponseEntity checkEmail(@RequestBody User.UserEmail userEmail){
        return userService.isUsableEmail(userEmail);
    }
}
