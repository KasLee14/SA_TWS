package com.sa.tws.mapper;

import com.sa.tws.domain.Bot;
import com.sa.tws.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BotMapper {

    public List<User> findAll(); //查询全部

    public List<User> findBot(String BotID); //查询单一

    public void insertBot(Bot bot); //添加用户

    public void deleteBot(String BotID); //通过UserID删除对应用户

    public void updateBotName(String BotID, String BotName);
    public void updateBotLocation(String BotID, String BotNum);
    public void updateBotStatus(String BotID, int BotStatus);
    public void updateShelfID(String BotID, String ShelfID);
    
}
