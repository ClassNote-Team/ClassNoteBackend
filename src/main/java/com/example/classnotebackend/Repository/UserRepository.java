package com.example.classnotebackend.Repository;

import com.example.classnotebackend.model.UserPO;
import org.apache.catalina.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserPO, String> {
    UserPO findByEmail(String email);
}
