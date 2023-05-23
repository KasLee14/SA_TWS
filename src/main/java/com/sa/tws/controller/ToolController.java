package com.sa.tws.controller;

import com.sa.tws.domain.Tool;
import com.sa.tws.mapper.ToolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToolController {
    @Autowired
    private ToolMapper toolMapper;

    @GetMapping("/Tool/findAll")
    public List<Tool> index(){
        return toolMapper.findAll();
    }

    @GetMapping("/Tool/findTool/Shelf{ToolID}")
    public List<Tool> index(@PathVariable String ToolID){
        return toolMapper.findTool(ToolID);
    }

    @PostMapping("/Tool/Update/")
    public void updateTool(@RequestBody Tool Tool){
        toolMapper.updateTool(Tool);
    }

    @PostMapping("/Tool/Insert/")
    public void insert(@RequestBody Tool Tool){
        toolMapper.insertTool(Tool);
    }

    @DeleteMapping("/Tool/Delete/{ToolID}")
    public void delete(@PathVariable String ToolID){
        toolMapper.deleteTool(ToolID);
    }
}
