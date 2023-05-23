package com.sa.tws.controller;

import com.sa.tws.domain.User;
import com.sa.tws.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/")
    public List<User> index(){
        return userMapper.findUser("114");
    }

    @PostMapping("/")
    public void updateUser(@RequestBody User user){
        userMapper.updateUser(user);
    }

    @PostMapping("/")
    public void insert(@RequestBody User user){
        userMapper.insertUser(user);
    }

    @DeleteMapping("/{UserID}")
    public void delete(@PathVariable String UserID){
        userMapper.deleteUser(UserID);
    }

}
