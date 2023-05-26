package com.sa.tws.mapper;

import com.sa.tws.domain.Request;
import com.sa.tws.domain.Tool;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RequestMapper {

    public List<Request> findAll(); //查询全部

    public List<Request> findRequest(String RequestID);

    public Boolean insertRequest(Request request);

    public Boolean deleteRequest(String RequestID);

    public Boolean updateRequest(Request request);

    public List<Request> selectPage(Integer pageNum, Integer pageSize, String ToolID);

    public Integer selectTotal(String ToolID);

}
