package com.sa.tws.mapper;

import com.sa.tws.domain.Shelf;
import com.sa.tws.domain.Shelf;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShelfMapper {

    public List<Shelf> findAll(); //查询全部

    public List<Shelf> findShelf(String ShelfID); //查询单一

    public void insertShelf(Shelf shelf); //添加用户

    public void deleteShelf(String ShelfID); //通过ShelfID删除对应用户

    public void updateLocation(String ShelfID, String Location);
    public void updateDepositoryID(String ShelfID, String DepositoryID);

}
