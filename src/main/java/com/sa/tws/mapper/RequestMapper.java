package com.sa.tws.mapper;

import com.sa.tws.domain.Request;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RequestMapper {

    public List<Request> findAll(); //查询全部

    public List<Request> findRequest(String RequestID);

    public void insertRequest(Request Request);

    public void deleteRequest(String RequestID);

    public void updateUserID(String RequestID, String UserID);
    public void updateType(String RequestID, int RequestType);
    public void updateTargetToolID(String RequestID, String ToolID);
    public void updateTargetNum(String RequestID, int TargetNum);
    public void updateResult(String RequestID, int RequestResult);
    
}
