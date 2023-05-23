package com.sa.tws.controller;

import cn.hutool.core.util.StrUtil;
import com.sa.tws.controller.dto.UserDTO;
import com.sa.tws.domain.Shelf;
import com.sa.tws.domain.User;
import com.sa.tws.mapper.UserMapper;
import com.sa.tws.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //登录
    @PostMapping("/User/login/")
    public boolean login(@RequestBody UserDTO userDTO){
        String userName = userDTO.getUserName();
        String userPassword = userDTO.getUserPassword();
        if(StrUtil.isBlank(userName) || StrUtil.isBlank(userPassword)){
            return false;
        }
        return userService.login(userDTO);
    }

    //查询全部
    @GetMapping("/User/findAll/")
    public List<User> index(){
        return userService.findAll();
    }

    //通过ID特定查询
    @GetMapping("/User/findUser/#{UserID}")
    public List<User> index(@PathVariable String UserID){
        return userService.findUser(UserID);
    }


    //有则插入新数据无则更新
    @PostMapping("/User/SaveOrUpdate/")
    public void updateUser(@RequestBody User user){
        userService.SaveOrUpdate(user);
    }

    //删除
    @DeleteMapping("/User/Delete/{UserID}")
    public void delete(@PathVariable String UserID){
        userService.delete(UserID);
    }

}
