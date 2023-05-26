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
    public RequestMapper requestMapper;

    public Boolean save(Request request){
        String requestID = request.getRequestID();
        if(!requestMapper.findRequest(requestID).isEmpty()){
            return requestMapper.updateRequest(request);
        }
        else{
            return requestMapper.insertRequest(request);
        }
    }



    public Boolean delete(String RequestID){
        return requestMapper.deleteRequest(RequestID);
    }

    public List<Request> findAll(){
        List<Request> list = requestMapper.findAll();
        return list;

    }

    public List<Request> findRequest(String RequestID){
        List<Request> list = requestMapper.findRequest(RequestID);
        return list;
    }
    
}
