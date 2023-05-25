package com.sa.tws.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sa.tws.controller.dto.UserDTO;
import com.sa.tws.domain.User;
import com.sa.tws.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.baomidou.mybatisplus.extension.toolkit.Db.getOne;

@Service
public class UserService {
    @Autowired
    public UserMapper userMapper;

    public void insert(User user){
        userMapper.insertUser(user);
    }

    public void update(User user){
        userMapper.updateUser(user);
    }

    public void delete(String UserID){
        userMapper.deleteUser(UserID);
    }

    public List<User> findAll(){
        List<User> list = userMapper.findAll();
        return list;

    }

    public List<User> findUser(String UserID){
        List<User> list = userMapper.findUser(UserID);
        return list;
    }

    public boolean login(UserDTO userDTO){
        String UserID = userDTO.getUserID();
        String UserPassword = userDTO.getUserPassword();
        List<User> list = userMapper.findUser(UserID);
        System.out.println(list);
        try{
            User user = list.get(0);
            return user.getUserPassword().equals(UserPassword);
        }catch(Exception e){
            return false;
        }
    }
}
