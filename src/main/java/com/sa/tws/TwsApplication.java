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




}
