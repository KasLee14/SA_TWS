package com.sa.tws.controller;

import com.sa.tws.domain.Request;
import com.sa.tws.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RequestController {

    @Autowired
    private RequestService requestService;

    //查询全部
    @GetMapping("/Request/findAll/")
    public List<Request> index(){
        return requestService.findAll();
    }

    //通过ID特定查询
    @GetMapping("/Request/findRequest/{RequestID}")
    public List<Request> index(@PathVariable String RequestID){
        return requestService.findRequest(RequestID);
    }


    //有则插入新数据无则更新
    @PostMapping("/Request/SaveOrUpdate/")
    public void updateRequest(@RequestBody Request request){
        requestService.SaveOrUpdate(request);
    }

    //删除
    @DeleteMapping("/Request/Delete/{RequestID}")
    public void delete(@PathVariable String RequestID){
        requestService.delete(RequestID);
    }
}
