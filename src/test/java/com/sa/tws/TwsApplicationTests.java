package com.sa.tws;

import com.sa.tws.domain.Tool;
import com.sa.tws.domain.User;
import com.sa.tws.mapper.ToolMapper;
import com.sa.tws.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TwsApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ToolMapper toolMapper;

    @Test
    public void testFindAll() {
        List<User> list = userMapper.findAll();
        System.out.println(list);
    }

    @Test
    public void testFindUser() {
        List<User> list = userMapper.findUser("114");
        System.out.println(list);
    }

    @Test
    public void testInsertTool(){
        Tool tool = new Tool("1222333", "SS", "132", "12323123", "23", 120);
        toolMapper.insertTool(tool);
    }

    @Test
    public void testDeleteID(){
        userMapper.deleteUser("123");
    }


}
