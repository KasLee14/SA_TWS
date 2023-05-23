package com.sa.tws.service;

import com.sa.tws.domain.Shelf;
import com.sa.tws.mapper.ShelfMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShelfService {

    @Autowired
    public ShelfMapper ShelfMapper;

    public void SaveOrUpdate(Shelf shelf){
        if(shelf.getShelfID() == null){
            ShelfMapper.insertShelf(shelf);
        }
        else{
            ShelfMapper.updateShelf(shelf);
        }
    }

    public void delete(String ShelfID){
        ShelfMapper.deleteShelf(ShelfID);
    }

    public List<Shelf> findAll(){
        List<Shelf> list = ShelfMapper.findAll();
        return list;

    }

    public List<Shelf> findShelf(String ShelfID){
        List<Shelf> list = ShelfMapper.findShelf(ShelfID);
        return list;
    }

}
