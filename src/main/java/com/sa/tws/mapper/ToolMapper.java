package com.sa.tws.mapper;

import com.sa.tws.domain.Tool;
import com.sa.tws.domain.Tool;
import com.sa.tws.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ToolMapper {

    public List<Tool> findAll(); //查询全部

    public List<Tool> findTool(String ToolID); //查询单一

    public void insertTool(Tool tool); //添加用户

    public void deleteTool(String ToolID); //通过ToolID删除对应用户

    public boolean updateTool(Tool tool);

    public List<Tool> selectPage(Integer pageNum, Integer pageSize, String ToolName);

    public Integer selectTotal(String ToolName);


}
