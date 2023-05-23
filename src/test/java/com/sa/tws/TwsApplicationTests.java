package com.sa.tws;

import com.sa.tws.domain.Bot;
import com.sa.tws.domain.Tool;
import com.sa.tws.domain.User;
import com.sa.tws.mapper.ToolMapper;
import com.sa.tws.mapper.UserMapper;
import com.sa.tws.service.BotService;
import com.sa.tws.service.UserService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TwsApplicationTests {

    @Autowired
    private UserService userService;

    @Autowired
    private BotService botService;


    @Test
    public void testFindAll() {
        List<User> list = userService.findAll();
        System.out.println(list);
    }
    @Test
    public void testFindAllB() {
        List<Bot> list = botService.findBot("33");
        System.out.println(list);
    }
    @Test
    public void testFindUser() {
        List<User> list = userService.findUser("114");
        System.out.println(list);
    }

    @Test
    public void testInsertUser(){
        User bot = new User("1143", "23", "123", "542", "444");
        userService.insert(bot);
    }

    @Test
    public void testInsertBot(){
        Bot bot = new Bot("114", "23", 1, "542");
        botService.insert(bot);
    }

    @Test
    public void testDeleteID(){
        userService.delete("123");
    }


}
