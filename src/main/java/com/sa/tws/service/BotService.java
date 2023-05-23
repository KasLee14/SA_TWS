package com.sa.tws.service;

import com.sa.tws.domain.Bot;
import com.sa.tws.mapper.BotMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BotService {
    
    @Autowired
    public com.sa.tws.mapper.BotMapper BotMapper;

    public void SaveOrUpdate(Bot bot){
        if(bot.getBotID() == null){
            BotMapper.insertBot(bot);
        }
        else{
            BotMapper.updateBot(bot);
        }
    }

    public void delete(String BotID){
        BotMapper.deleteBot(BotID);
    }

    public List<Bot> findAll(){
        List<Bot> list = BotMapper.findAll();
        return list;

    }

    public List<Bot> findBot(String BotID){
        List<Bot> list = BotMapper.findBot(BotID);
        return list;
    }

}
