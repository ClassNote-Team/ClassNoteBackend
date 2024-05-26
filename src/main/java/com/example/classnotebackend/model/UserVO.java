package com.example.classnotebackend.model;

public class UserVO {
    private String id;
    private String username;
    private String password;
    private String email;

    public static UserVO of(UserPO po){
        UserVO vo = new UserVO();
        vo.id = po.getId();
        vo.username = po.getUsername();
        vo.password = po.getPassword();
        vo.email = po.getEmail();
        return vo;
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
