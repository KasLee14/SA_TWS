package com.sa.tws.service;

import com.sa.tws.domain.Tool;
import com.sa.tws.domain.Tool;
import com.sa.tws.mapper.ToolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToolService {

    @Autowired
    public ToolMapper toolMapper;

    public void insert(Tool tool){
        toolMapper.insertTool(tool);
    }

    public boolean update(Tool tool){
        return toolMapper.updateTool(tool);
    }

    public void delete(String ToolID){
        toolMapper.deleteTool(ToolID);
    }

    public List<Tool> findAll(){
        List<Tool> list = toolMapper.findAll();
        return list;

    }

    public List<Tool> findTool(String ToolID){
        List<Tool> list = toolMapper.findTool(ToolID);
        return list;
    }

}
