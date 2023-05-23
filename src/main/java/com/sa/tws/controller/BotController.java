package com.sa.tws.controller;

import com.sa.tws.domain.Bot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BotController {

    @Autowired
    private com.sa.tws.mapper.BotMapper botMapper;

    @GetMapping("/Bot/findAll/")
    public List<Bot> index(){
        return botMapper.findAll();
    }

    @GetMapping("/Bot/findBot/{BotID}")
    public List<Bot> index(@PathVariable String BotID){
        return botMapper.findBot(BotID);
    }

    @PostMapping("/Bot/Update/")
    public void updateBot(@RequestBody Bot bot){
        botMapper.updateBot(bot);
    }

    @PostMapping("/Bot/Insert/")
    public void insert(@RequestBody Bot bot){
        botMapper.insertBot(bot);
    }

    @DeleteMapping("/Bot/Delete{BotID}")
    public void delete(@PathVariable String BotID){
        botMapper.deleteBot(BotID);
    }
}
