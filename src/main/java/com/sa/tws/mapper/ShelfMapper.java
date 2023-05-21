package com.sa.tws.mapper;

import com.sa.tws.domain.Shelf;
import com.sa.tws.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShelfMapper {

    public List<User> findAll(); //查询全部

    public List<User> findShelf(String ShelfID); //查询单一

    public void insertShelf(Shelf shelf); //添加用户

    public void deleteShelf(String ShelfID); //通过UserID删除对应用户

    public void updateLocation(String ShelfID, String Location);
    public void updateDepositoryID(String ShelfID, String DepositoryID);

}
