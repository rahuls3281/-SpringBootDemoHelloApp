package com.example.helloapp.service;

import com.example.helloapp.model.User;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public User getMessage(){
        return new User(101,"Rahul","Hello");
    }
}
