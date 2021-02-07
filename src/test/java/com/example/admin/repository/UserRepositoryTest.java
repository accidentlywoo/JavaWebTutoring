package com.example.admin.repository;

import com.example.admin.AdminApplicationTests;
import com.example.admin.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest extends AdminApplicationTests {
    //CRUD Test

    @Autowired
    private UserRepository userRepository;

    @Test
    public void create(){
        User user = new User();
//        user.setId(); auto increament
        user.setAccount("TestUser01");
        user.setEmail("TestUser01@gmail.com");
        user.setPhoneNumber("010-1111-1111");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("admin");
        user.setAccount("TestUser03");

        User newUser = userRepository.save(user);
        System.out.println("newUser : "+ newUser);
    }

    public void read(){

    }

    public void update(){

    }

    public void delete(){}
}