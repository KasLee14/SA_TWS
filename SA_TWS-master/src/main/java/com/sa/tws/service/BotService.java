package com.sa.tws.service;

import com.sa.tws.domain.Bot;
import com.sa.tws.mapper.BotMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BotService {
    
    @Autowired
    public BotMapper botMapper;

    public void insert(Bot bot){
        botMapper.insertBot(bot);
    }

    public void update(Bot bot){
        botMapper.updateBot(bot);
    }

    public void delete(String BotID){
        botMapper.deleteBot(BotID);
    }

    public List<Bot> findAll(){
        List<Bot> list = botMapper.findAll();
        return list;

    }

    public List<Bot> findBot(String BotID){
        List<Bot> list = botMapper.findBot(BotID);
        return list;
    }

}
