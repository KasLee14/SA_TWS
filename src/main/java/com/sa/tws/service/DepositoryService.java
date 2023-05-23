package com.sa.tws.service;

import com.sa.tws.domain.Depository;
import com.sa.tws.mapper.DepositoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepositoryService {
    
    @Autowired
    public DepositoryMapper DepositoryMapper;

    public void SaveOrUpdate(Depository depository){
        if(depository.getDepositoryID() == null){
            DepositoryMapper.insertDepository(depository);
        }
        else{
            DepositoryMapper.updateDepository(depository);
        }
    }

    public void delete(String DepositoryID){
        DepositoryMapper.deleteDepository(DepositoryID);
    }

    public List<Depository> findAll(){
        List<Depository> list = DepositoryMapper.findAll();
        return list;

    }

    public List<Depository> findDepository(String DepositoryID){
        List<Depository> list = DepositoryMapper.findDepository(DepositoryID);
        return list;
    }
}
