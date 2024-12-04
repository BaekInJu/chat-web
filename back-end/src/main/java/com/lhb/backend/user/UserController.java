package com.lhb.backend.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserService userService;
    @PostMapping("/signUp")
    public void singUp(@RequestBody UserDTO userDTO){
        userService.createUser(userDTO);
    }
}
