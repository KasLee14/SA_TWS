package com.sa.tws;


import com.sa.tws.domain.Bot;
import com.sa.tws.domain.User;
import com.sa.tws.service.BotService;
import com.sa.tws.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@SpringBootApplication
@CrossOrigin
public class TwsApplication {


    public static void main(String[] args) {
        SpringApplication.run(TwsApplication.class, args);
    }


    class TwsApplicationTests {

        @Autowired
        private UserService userService;

        @Autowired
        private BotService botService;



        public void testFindAll() {
            List<User> list = userService.findAll();
            System.out.println(list);
        }

        public void testFindAllB() {
            List<Bot> list = botService.findBot("33");
            System.out.println(list);
        }

        public void testFindUser() {
            List<User> list = userService.findUser("114");
            System.out.println(list);
        }


        public void testInsertUser(){
            User bot = new User("1143", "23", "123", "542", "444");
            userService.insert(bot);
        }


        public void testInsertBot(){
            Bot bot = new Bot("114", "23", 1, "542");
            botService.insert(bot);
        }


        public void testDeleteID(){
            userService.delete("123");
        }


    }


}
