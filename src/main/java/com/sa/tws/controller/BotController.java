package com.sa.tws.controller;

import com.sa.tws.domain.Bot;
import com.sa.tws.domain.Bot;
import com.sa.tws.service.BotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BotController {

    @Autowired
    private BotService botService;

    //查询全部
    @GetMapping("/Bot/findAll")
    public List<Bot> index(){
        return botService.findAll();
    }

    //通过ID特定查询
    @GetMapping("/Bot/findBot/{BotID}")
    public List<Bot> index(@PathVariable String BotID){
        return botService.findBot(BotID);
    }


    //有则插入新数据无则更新
    @PostMapping("/Bot/Insert")
    public void insertBot(@RequestBody Bot bot){
        if(botService.findBot(bot.getBotID()).isEmpty()){
            botService.insert(bot);
        }
    }

    @PostMapping("/Bot/Update")
    public void updateBot(@RequestBody Bot bot){
        botService.update(bot);
    }
    //删除
    @PostMapping("/Bot/Delete/{BotID}")
    public void delete(@PathVariable String BotID){
        botService.delete(BotID);
    }
}
