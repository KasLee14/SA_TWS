package com.sa.tws.controller;

import com.sa.tws.domain.Shelf;
import com.sa.tws.mapper.ShelfMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShelfController {

    @Autowired
    private com.sa.tws.mapper.ShelfMapper ShelfMapper;

    @GetMapping("/")
    public List<Shelf> index(){
        return ShelfMapper.findAll();
    }

    @GetMapping("/{ShelfID}")
    public List<Shelf> index(@PathVariable String ShelfID){
        return ShelfMapper.findShelf(ShelfID);
    }

    @PostMapping("/")
    public void updateShelf(@RequestBody Shelf shelf){
        ShelfMapper.updateShelf(shelf);
    }

    @PostMapping("/")
    public void insert(@RequestBody Shelf Shelf){
        ShelfMapper.insertShelf(Shelf);
    }

    @DeleteMapping("/{ShelfID}")
    public void delete(@PathVariable String ShelfID){
        ShelfMapper.deleteShelf(ShelfID);
    }
    
}
