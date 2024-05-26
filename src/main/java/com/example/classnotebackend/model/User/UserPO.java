package com.example.classnotebackend.model.User;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class UserPO{
    private String id;
    private String username;
    private String password;
    private String email;

    public static UserPO of(UserCreateRequest request){
        UserPO po = new UserPO();
        po.username = request.getUsername();
        po.password = request.getPassword();
        po.email = request.getEmail();
        return po;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }
}
