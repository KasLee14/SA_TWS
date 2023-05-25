package com.sa.tws.controller;

import com.sa.tws.domain.Shelf;
import com.sa.tws.domain.Shelf;
import com.sa.tws.service.ShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
@CrossOrigin
public class ShelfController {

    @Autowired
    private ShelfService shelfService;

    //查询全部
    @GetMapping("/Shelf/findAll")
    public List<Shelf> index(){
        return shelfService.findAll();
    }

    //通过ID特定查询
    @GetMapping("/Shelf/findShelf/{ShelfID}")
    public List<Shelf> index(@PathVariable String ShelfID){
        return shelfService.findShelf(ShelfID);
    }


    //有则插入新数据无则更新
    @PostMapping("/Shelf/Insert")
    public void insertShelf(@RequestBody Shelf shelf){
        shelfService.insert(shelf);
    }

    @PostMapping("/Shelf/Update")
    public void updateShelf(@RequestBody Shelf shelf){
        shelfService.update(shelf);
    }

    //删除
    @DeleteMapping("/Shelf/Delete/{ShelfID}")
    public void delete(@PathVariable String ShelfID){
        shelfService.delete(ShelfID);
    }
    
}
