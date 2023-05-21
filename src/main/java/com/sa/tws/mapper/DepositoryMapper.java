package com.sa.tws.mapper;

import com.sa.tws.domain.Depository;
import com.sa.tws.domain.Depository;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepositoryMapper {

    public List<Depository> findAll(); //查询全部

    public List<Depository> findDepository(String DepositoryID); //查询单一

    public void insertDepository(Depository depository); //添加用户

    public void deleteDepository(String DepositoryID); //通过DepositoryID删除对应用户
    

}
