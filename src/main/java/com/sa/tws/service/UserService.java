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


    public int save(User user){
        String userID = user.getUserID();
        if(!userMapper.findUser(userID).isEmpty()){
            return userMapper.updateUser(user);
        }
        else{
            return userMapper.insertUser(user);
        }
    }

    public Integer delete(String UserID){
        return userMapper.deleteUser(UserID);
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
        System.out.println(userDTO);
        try{
            User user = list.get(0);
            String pw = user.getUserPassword();
            if(pw.equals(UserPassword)){
                if(user.getUserType().equals("Admin")){
                    return true;
                }else return false;
            }else return false;
        }catch(Exception e){
            System.out.println("Error");
            return false;
        }
    }
}
