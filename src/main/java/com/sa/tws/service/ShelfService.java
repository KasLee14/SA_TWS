package com.sa.tws.service;

import com.sa.tws.domain.Shelf;
import com.sa.tws.mapper.ShelfMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShelfService {

    @Autowired
    public ShelfMapper shelfMapper;

    public void insert(Shelf shelf){
        shelfMapper.insertShelf(shelf);
    }

    public void update(Shelf shelf){
        shelfMapper.updateShelf(shelf);
    }

    public void delete(String ShelfID){
        shelfMapper.deleteShelf(ShelfID);
    }

    public List<Shelf> findAll(){
        List<Shelf> list = shelfMapper.findAll();
        return list;

    }

    public List<Shelf> findShelf(String ShelfID){
        List<Shelf> list = shelfMapper.findShelf(ShelfID);
        return list;
    }

}
