package com.sa.tws.controller;

import com.sa.tws.domain.Request;
import com.sa.tws.domain.Request;
import com.sa.tws.domain.Tool;
import com.sa.tws.domain.User;
import com.sa.tws.mapper.RequestMapper;
import com.sa.tws.service.RequestService;
import com.sa.tws.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Request")
public class RequestController {

    @Autowired
    private ToolService toolService;

    @Autowired
    private RequestService requestService;

    @Autowired
    private RequestMapper requestMapper;

    //查询全部
    @GetMapping
    public List<Request> index(){
        return requestService.findAll();
    }

    //通过ID特定查询
    @GetMapping("/findRequest/{RequestID}")
    public List<Request> index(@PathVariable String RequestID){
        return requestService.findRequest(RequestID);
    }


    //有则插入新数据无则更新

    @PostMapping
    public Boolean updateRequest(@RequestBody Request request){
        return requestService.save(request);
    }

    //删除
    @DeleteMapping("/{RequestID}")
    public Boolean delete(@PathVariable String RequestID){
        return requestService.delete(RequestID);
    }

    @PostMapping("/Borrow")
    public void borrow(@RequestBody Request request){
        if(!requestService.findRequest(request.getRequestID()).isEmpty()){
            Tool tool = toolService.findTool(request.getToolID()).get(0);
            tool.setToolNum(tool.getToolNum() - request.getRequestTargetNum());
            toolService.delete(request.getToolID());
            toolService.insert(tool);
            requestService.delete(request.getRequestID());
        }
    }
    @GetMapping("/Page")
    public Map<String, Object> findPage(@RequestParam Integer pageNum, @RequestParam Integer pageSize, @RequestParam String ToolID){
        pageNum = (pageNum - 1) * pageSize;
        ToolID = "%" + ToolID + "%";
        List<Request> data = requestMapper.selectPage(pageNum, pageSize, ToolID);
        Integer total = requestMapper.selectTotal(ToolID);
        Map<String, Object> res = new HashMap<>();
        res.put("data", data);
        res.put("total", total);
        return res;
    }


}
