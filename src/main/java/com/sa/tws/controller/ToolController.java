package com.sa.tws.controller;

import com.sa.tws.domain.Tool;
import com.sa.tws.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToolController {
    @Autowired
    private ToolService toolService;

    //查询全部
    @GetMapping("/Tool/findAll/")
    public List<Tool> index(){
        return toolService.findAll();
    }

    //通过ID特定查询
    @GetMapping("/Tool/findTool/{ToolID}")
    public List<Tool> index(@PathVariable String ToolID){
        return toolService.findTool(ToolID);
    }


    //有则插入新数据无则更新
    @PostMapping("/Tool/SaveOrUpdate/")
    public void updateTool(@RequestBody Tool tool){
        toolService.SaveOrUpdate(tool);
    }

    //删除
    @DeleteMapping("/Tool/Delete/{ToolID}")
    public void delete(@PathVariable String ToolID){
        toolService.delete(ToolID);
    }
}
