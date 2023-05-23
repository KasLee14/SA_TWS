package com.sa.tws.controller;

import com.sa.tws.domain.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RequestController {

    @Autowired
    private com.sa.tws.mapper.RequestMapper RequestMapper;

    @GetMapping("/")
    public List<Request> index(){
        return RequestMapper.findAll();
    }

    @GetMapping("/{RequestID}")
    public List<Request> index(@PathVariable String RequestID){
        return RequestMapper.findRequest(RequestID);
    }

    @PostMapping("/")
    public void updateRequest(@RequestBody Request request){
        RequestMapper.updateRequest(request);
    }

    @PostMapping("/")
    public void insert(@RequestBody Request Request){
        RequestMapper.insertRequest(Request);
    }

    @DeleteMapping("/{RequestID}")
    public void delete(@PathVariable String RequestID){
        RequestMapper.deleteRequest(RequestID);
    }
}
