package com.sa.tws.controller;

import cn.hutool.core.util.StrUtil;
import com.sa.tws.controller.dto.UserDTO;
import com.sa.tws.domain.Shelf;
import com.sa.tws.domain.User;
import com.sa.tws.mapper.UserMapper;
import com.sa.tws.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    //登录
    @PostMapping("/login")
    public boolean login(@RequestBody UserDTO userDTO){
        return userService.login(userDTO);
    }

    //查询全部
    @GetMapping
    public List<User> index(){
        List<User> list = userMapper.findAll();
        return list;
    }

    @PostMapping
    public int updateUser(@RequestBody User user){
        return userService.save(user);
    }

    //删除
    @DeleteMapping("/{UserID}")
    public void delete(@PathVariable String UserID){
        userService.delete(UserID);
    }

    @GetMapping("/Page")
    public Map<String, Object> findPage(@RequestParam Integer pageNum, @RequestParam Integer pageSize, @RequestParam String UserName){
        pageNum = (pageNum - 1) * pageSize;
        UserName = "%" + UserName + "%";
        List<User> data = userMapper.selectPage(pageNum, pageSize, UserName);
        Integer total = userMapper.selectTotal(UserName);
        Map<String, Object> res = new HashMap<>();
        res.put("data", data);
        res.put("total", total);
        return res;
    }

}
