package com.example.admin.repository;

import com.example.admin.AdminApplicationTests;
import com.example.admin.model.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

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

    @Test
    public void read(){
        Optional<User> user = userRepository.findById(2L);

        user.ifPresent(i -> {
            System.out.println("user : "+ i);
            System.out.println("email : " + i.getEmail());
        });
    }

    @Test
    public void update(){
        Optional<User> user = userRepository.findById(3L);
        user.ifPresent(i -> {
            i.setAccount("Update");
            i.setUpdatedAt(LocalDateTime.now());
            i.setEmail("update@gmail.com");
            i.setUpdatedBy("updated!!");

            userRepository.save(i);
        });
    }

    @Test
    @Transactional
    public void delete(){
        Optional<User> user = userRepository.findById(2L);

        assertTrue(user.isPresent());
        user.ifPresent(i -> {
            userRepository.delete(i);
        });

        Optional<User> deletedUser = userRepository.findById(2L);

        assertFalse(deletedUser.isPresent());
    }
}