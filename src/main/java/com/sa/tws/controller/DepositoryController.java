package com.sa.tws.controller;

import com.sa.tws.domain.Depository;
import com.sa.tws.domain.Depository;
import com.sa.tws.service.DepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepositoryController {

    @Autowired
    private DepositoryService depositoryService;

    //查询全部
    @GetMapping("/Depository/findAll")
    public List<Depository> index(){
        return depositoryService.findAll();
    }

    //通过ID特定查询
    @GetMapping("/Depository/findDepository/{DepositoryID}")
    public List<Depository> index(@PathVariable String DepositoryID){
        return depositoryService.findDepository(DepositoryID);
    }


    //有则插入新数据无则更新
    @PostMapping("/Depository/Insert")
    public void insertDepository(@RequestBody Depository depository){
        if(depositoryService.findDepository(depository.getDepositoryID()).isEmpty()){
            depositoryService.insert(depository);
        }
    }

    @PostMapping("/Depository/Update")
    public void updateDepository(@RequestBody Depository depository){
        depositoryService.update(depository);
    }

    //删除
    @PostMapping("/Depository/Delete/{DepositoryID}")
    public void delete(@PathVariable String DepositoryID){
        depositoryService.delete(DepositoryID);
    }
}
