package com.sa.tws.controller;

import com.sa.tws.domain.Depository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepositoryController {

    @Autowired
    private com.sa.tws.mapper.DepositoryMapper depositoryMapper;

    @GetMapping("/")
    public List<Depository> index(){
        return depositoryMapper.findAll();
    }

    @GetMapping("/{DepositoryID}")
    public List<Depository> index(@PathVariable String DepositoryID){
        return depositoryMapper.findDepository(DepositoryID);
    }


    @PostMapping("/")
    public void insert(@RequestBody Depository depository){
        depositoryMapper.insertDepository(depository);
    }

    @DeleteMapping("/{DepositoryID}")
    public void delete(@PathVariable String DepositoryID){
        depositoryMapper.deleteDepository(DepositoryID);
    }
}
