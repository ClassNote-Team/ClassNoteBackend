package com.example.classnotebackend.service;


import com.example.classnotebackend.Repository.UserRepository;
import com.example.classnotebackend.model.UserCreateRequest;
import com.example.classnotebackend.model.UserLoginRequest;
import com.example.classnotebackend.model.UserPO;
import com.example.classnotebackend.model.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserVO registerUser(UserCreateRequest userCreateRequest) {
        if (userRepository.findByEmail(userCreateRequest.getEmail()) != null) {
            throw new RuntimeException("User already exists");
        }
        UserPO userPO = UserPO.of(userCreateRequest);
        userRepository.insert(userPO);
        return UserVO.of(userPO);
    }

    public UserVO login(UserLoginRequest userLoginRequest) {
        UserPO userPO = userRepository.findByEmail(userLoginRequest.getEmail());
        if (userPO != null && userPO.getPassword().equals(userLoginRequest.getPassword())) {
            return UserVO.of(userPO);
        } else {
            throw new RuntimeException("Login failed");
        }
    }
}
