package com.sa.tws.controller;

import com.sa.tws.domain.Request;
import com.sa.tws.domain.Tool;
import com.sa.tws.domain.Tool;
import com.sa.tws.domain.User;
import com.sa.tws.mapper.ToolMapper;
import com.sa.tws.service.RequestService;
import com.sa.tws.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Tool")
public class ToolController {
    @Autowired
    private ToolService toolService;

    @Autowired
    private ToolMapper toolMapper;

    //查询全部
    @GetMapping("/findAll")
    public List<Tool> index(){
        return toolService.findAll();
    }

    //通过ID特定查询
    @GetMapping("/findTool/{ToolID}")
    public List<Tool> index(@PathVariable String ToolID){
        return toolService.findTool(ToolID);
    }



    @PostMapping
    public boolean updateTool(@RequestBody Tool tool){
        return toolService.update(tool);
    }

    //删除
    @PostMapping("/{ToolID}")
    public void delete(@PathVariable String ToolID){
        toolService.delete(ToolID);
    }

    @GetMapping("/Page")
    public Map<String, Object> findPage(@RequestParam Integer pageNum, @RequestParam Integer pageSize, @RequestParam String ToolName){
        pageNum = (pageNum - 1) * pageSize;
        ToolName = "%" + ToolName + "%";
        List<Tool> data = toolMapper.selectPage(pageNum, pageSize, ToolName);
        Integer total = toolMapper.selectTotal(ToolName);
        Map<String, Object> res = new HashMap<>();
        res.put("data", data);
        res.put("total", total);
        return res;
    }



}
