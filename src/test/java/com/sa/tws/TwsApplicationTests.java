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
    public void testUpdateuser(){
        User bot = new User("121", "pcs", "pcs", "2","C3");
        userService.update(bot);
    }




}
