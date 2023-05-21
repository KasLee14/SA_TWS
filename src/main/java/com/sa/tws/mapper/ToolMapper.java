package com.sa.tws.mapper;

import com.sa.tws.domain.Tool;
import com.sa.tws.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ToolMapper {

    public List<User> findAll(); //查询全部

    public List<User> findTool(String ToolID); //查询单一

    public void insertTool(Tool tool); //添加用户

    public void deleteTool(String ToolID); //通过UserID删除对应用户

    public void updateToolName(String ToolID, String ToolName);
    public void updateToolNum(String ToolID, int ToolNum);
    public void updateToolLocation(String ToolID, String ToolLocation);
    public void updateShelfID(String ToolID, String ShelfID);

}
