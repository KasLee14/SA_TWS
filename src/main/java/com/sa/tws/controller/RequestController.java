package com.sa.tws.controller;

import com.sa.tws.domain.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RequestController {

    @Autowired
    private com.sa.tws.mapper.RequestMapper requestMapper;

    @GetMapping("/Request/findAll/")
    public List<Request> index(){
        return requestMapper.findAll();
    }

    @GetMapping("/Request/findRequest/{RequestID}")
    public List<Request> index(@PathVariable String RequestID){
        return requestMapper.findRequest(RequestID);
    }

    @PostMapping("/Request/Update/")
    public void updateRequest(@RequestBody Request request){
        requestMapper.updateRequest(request);
    }

    @PostMapping("/Request/Insert/")
    public void insert(@RequestBody Request Request){
        requestMapper.insertRequest(Request);
    }

    @DeleteMapping("/Request/Delete/{RequestID}")
    public void delete(@PathVariable String RequestID){
        requestMapper.deleteRequest(RequestID);
    }
}
