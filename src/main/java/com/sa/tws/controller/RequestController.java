package com.sa.tws.controller;

import com.sa.tws.domain.Request;
import com.sa.tws.domain.Request;
import com.sa.tws.domain.Tool;
import com.sa.tws.service.RequestService;
import com.sa.tws.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
@CrossOrigin
public class RequestController {

    @Autowired
    private ToolService toolService;

    @Autowired
    private RequestService requestService;

    //查询全部
    @GetMapping("/Request/findAll")
    public List<Request> index(){
        return requestService.findAll();
    }

    //通过ID特定查询
    @GetMapping("/Request/findRequest/{RequestID}")
    public List<Request> index(@PathVariable String RequestID){
        return requestService.findRequest(RequestID);
    }


    //有则插入新数据无则更新
    @PostMapping("/Request/Insert")
    public void insertRequest(@RequestBody Request request){
        if(requestService.findRequest(request.getRequestID()).isEmpty()){
            requestService.insert(request);
        }
    }

    @PostMapping("/Request/Update")
    public void updateRequest(@RequestBody Request request){
        requestService.update(request);
    }

    //删除
    @PostMapping("/Request/Delete/{RequestID}")
    public void delete(@PathVariable String RequestID){
        requestService.delete(RequestID);
    }

    @PostMapping("/Tool/Borrow")
    public void borrow(@RequestBody Request request){
        if(!requestService.findRequest(request.getRequestID()).isEmpty()){
            Tool tool = toolService.findTool(request.getToolID()).get(0);
            tool.setToolNum(tool.getToolNum() - request.getRequestTargetNum());
            toolService.delete(request.getToolID());
            toolService.insert(tool);
            requestService.delete(request.getRequestID());
        }
    }

}
