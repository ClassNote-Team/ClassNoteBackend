package com.example.classnotebackend.service.User;


import com.example.classnotebackend.Repository.User.UserRepository;
import com.example.classnotebackend.model.User.UserCreateRequest;
import com.example.classnotebackend.model.User.UserLoginRequest;
import com.example.classnotebackend.model.User.UserPO;
import com.example.classnotebackend.model.User.UserVO;
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
