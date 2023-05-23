package com.sa.tws.controller;

import com.sa.tws.domain.Bot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BotController {

    @Autowired
    private com.sa.tws.mapper.BotMapper BotMapper;

    @GetMapping("/")
    public List<Bot> index(){
        return BotMapper.findAll();
    }

    @GetMapping("/{BotID}")
    public List<Bot> index(@PathVariable String BotID){
        return BotMapper.findBot(BotID);
    }

    @PostMapping("/")
    public void updateBot(@RequestBody Bot bot){
        BotMapper.updateBot(bot);
    }

    @PostMapping("/")
    public void insert(@RequestBody Bot bot){
        BotMapper.insertBot(bot);
    }

    @DeleteMapping("/{BotID}")
    public void delete(@PathVariable String BotID){
        BotMapper.deleteBot(BotID);
    }
}
