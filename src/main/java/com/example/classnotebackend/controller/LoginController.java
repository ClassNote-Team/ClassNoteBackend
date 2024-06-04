package com.example.classnotebackend.controller;


import com.example.classnotebackend.model.User.UserCreateRequest;
import com.example.classnotebackend.model.User.UserLoginRequest;
import com.example.classnotebackend.model.User.UserVO;
import com.example.classnotebackend.service.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<Void> register(@RequestBody UserCreateRequest userCreateRequest) {
        try {
            UserVO userVO = userService.registerUser(userCreateRequest);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.status(409).build();  // HTTP 409 Conflict
        }
    }

    @PostMapping("/login")
    public ResponseEntity<UserVO> login(@RequestBody UserLoginRequest userLoginRequest) {
        try {
            UserVO userVO = userService.login(userLoginRequest);
            return ResponseEntity.ok(userVO);
        } catch (RuntimeException e) {
            return ResponseEntity.status(401).build();  // HTTP 401 Unauthorized
        }
    }
}
