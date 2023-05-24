package com.sa.tws.controller;

import com.sa.tws.domain.Tool;
import com.sa.tws.domain.Tool;
import com.sa.tws.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
@CrossOrigin
public class ToolController {
    @Autowired
    private ToolService toolService;

    //查询全部
    @GetMapping("/Tool/findAll")
    public List<Tool> index(){
        return toolService.findAll();
    }

    //通过ID特定查询
    @GetMapping("/Tool/findTool/{ToolID}")
    public List<Tool> index(@PathVariable String ToolID){
        return toolService.findTool(ToolID);
    }


    //有则插入新数据无则更新
    @PostMapping("/Tool/Insert")
    public void insertTool(@RequestBody Tool tool){
        if(toolService.findTool(tool.getToolID()).isEmpty()){
            toolService.insert(tool);
        }
    }

    @PostMapping("/Tool/Update")
    public void updateTool(@RequestBody Tool tool){
        toolService.update(tool);
    }

    //删除
    @PostMapping("/Tool/Delete/{ToolID}")
    public void delete(@PathVariable String ToolID){
        toolService.delete(ToolID);
    }
}
