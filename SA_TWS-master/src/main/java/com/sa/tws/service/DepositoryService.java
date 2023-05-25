package com.sa.tws.service;

import com.sa.tws.domain.Depository;
import com.sa.tws.mapper.DepositoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepositoryService {
    
    @Autowired
    public DepositoryMapper depositoryMapper;

    public void insert(Depository depository){
        depositoryMapper.insertDepository(depository);
    }

    public void update(Depository depository){
        depositoryMapper.updateDepository(depository);
    }

    public void delete(String DepositoryID){
        depositoryMapper.deleteDepository(DepositoryID);
    }

    public List<Depository> findAll(){
        List<Depository> list = depositoryMapper.findAll();
        return list;

    }

    public List<Depository> findDepository(String DepositoryID){
        List<Depository> list = depositoryMapper.findDepository(DepositoryID);
        return list;
    }
}
