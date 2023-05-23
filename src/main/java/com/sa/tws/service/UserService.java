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

    public void SaveOrUpdate(User user){
        if(user.getUserID() == null){
            userMapper.insertUser(user);
        }
        else{
            userMapper.updateUser(user);
        }
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
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("UserName", userDTO.getUserName());
        queryWrapper.eq("UserPassword", userDTO.getUserPassword());
        User one = getOne(queryWrapper);
        return one != null;

    }
}
