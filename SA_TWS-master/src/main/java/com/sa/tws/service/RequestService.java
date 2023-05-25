package com.sa.tws.service;

import com.sa.tws.domain.Request;
import com.sa.tws.domain.Request;
import com.sa.tws.mapper.RequestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService {
    @Autowired
    public RequestMapper RequestMapper;

    public void insert(Request request){
        RequestMapper.insertRequest(request);
    }

    public void update(Request request){
        RequestMapper.updateRequest(request);
    }

    public void delete(String RequestID){
        RequestMapper.deleteRequest(RequestID);
    }

    public List<Request> findAll(){
        List<Request> list = RequestMapper.findAll();
        return list;

    }

    public List<Request> findRequest(String RequestID){
        List<Request> list = RequestMapper.findRequest(RequestID);
        return list;
    }
    
}
