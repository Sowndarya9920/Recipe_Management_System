package com.sowndarya.ReceipeManagementSystem.controller;

import com.sowndarya.ReceipeManagementSystem.dto.SignInInput;
import com.sowndarya.ReceipeManagementSystem.dto.SignInOutput;
import com.sowndarya.ReceipeManagementSystem.dto.SignUpInput;
import com.sowndarya.ReceipeManagementSystem.dto.SignUpOutput;
import com.sowndarya.ReceipeManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/signUp")
    public SignUpOutput signUp(@RequestBody SignUpInput signUpDto){
        return userService.signUp(signUpDto);
    }

    @PostMapping("/signIn")
    public SignInOutput signIn(@RequestBody SignInInput signInDto){
        return userService.signIn(signInDto);
    }

}
