package com.sa.tws.controller;

import com.sa.tws.domain.Shelf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShelfController {

    @Autowired
    private com.sa.tws.mapper.ShelfMapper shelfMapper;

    @GetMapping("/Shelf/findAll/")
    public List<Shelf> index(){
        return shelfMapper.findAll();
    }

    @GetMapping("/Shelf/findShelf/{ShelfID}")
    public List<Shelf> index(@PathVariable String ShelfID){
        return shelfMapper.findShelf(ShelfID);
    }

    @PostMapping("/Shelf/Update/")
    public void updateShelf(@RequestBody Shelf shelf){
        shelfMapper.updateShelf(shelf);
    }

    @PostMapping("/Shelf/Insert/")
    public void insert(@RequestBody Shelf Shelf){
        shelfMapper.insertShelf(Shelf);
    }

    @DeleteMapping("/Shelf/Delete/{ShelfID}")
    public void delete(@PathVariable String ShelfID){
        shelfMapper.deleteShelf(ShelfID);
    }
    
}
