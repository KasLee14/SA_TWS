package com.sa.tws.mapper;

import com.sa.tws.domain.Tool;
import com.sa.tws.domain.Tool;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ToolMapper {

    public List<Tool> findAll(); //查询全部

    public List<Tool> findTool(String ToolID); //查询单一

    public void insertTool(Tool tool); //添加用户

    public void deleteTool(String ToolID); //通过ToolID删除对应用户

    public void updateTool(Tool tool);


}
