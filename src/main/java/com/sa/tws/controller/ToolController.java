package com.sa.tws.controller;

import com.sa.tws.domain.Tool;
import com.sa.tws.mapper.ToolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToolController {
    @Autowired
    private ToolMapper ToolMapper;

    @GetMapping("/")
    public List<Tool> index(){
        return ToolMapper.findAll();
    }

    @GetMapping("/{ToolID}")
    public List<Tool> index(@PathVariable String ToolID){
        return ToolMapper.findTool(ToolID);
    }

    @PostMapping("/")
    public void updateTool(@RequestBody Tool Tool){
        ToolMapper.updateTool(Tool);
    }

    @PostMapping("/")
    public void insert(@RequestBody Tool Tool){
        ToolMapper.insertTool(Tool);
    }

    @DeleteMapping("/{ToolID}")
    public void delete(@PathVariable String ToolID){
        ToolMapper.deleteTool(ToolID);
    }
}
