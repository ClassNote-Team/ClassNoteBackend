package com.example.classnotebackend.Repository.User;

import com.example.classnotebackend.model.User.UserPO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserPO, String> {
    UserPO findByEmail(String email);
}
