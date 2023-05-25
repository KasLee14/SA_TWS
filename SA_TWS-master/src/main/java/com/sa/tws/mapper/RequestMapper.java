package com.sa.tws.mapper;

import com.sa.tws.domain.Request;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RequestMapper {

    public List<Request> findAll(); //查询全部

    public List<Request> findRequest(String RequestID);

    public void insertRequest(Request request);

    public void deleteRequest(String RequestID);

    public void updateRequest(Request request);

}
