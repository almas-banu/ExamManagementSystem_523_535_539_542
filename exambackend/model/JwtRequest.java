package com.exam.model;

public class JwtRequest {
    String username;
    String password;

    public JwtRequest() {

    }

    public JwtRequest(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() { return password; }

}
