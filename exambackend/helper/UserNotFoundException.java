package com.exam.helper;

public class UserNotFoundException extends Exception{

    public UserNotFoundException() {
        super("User with this Username not found ");

    }

    public UserNotFoundException(String msg) { super(msg); }
}
