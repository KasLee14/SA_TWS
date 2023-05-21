package com.sa.tws.mapper;

import com.sa.tws.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> findAll(); //查询全部

    public List<User> findUser(String UserID); //查询单一

    public void insertUser(User user); //添加用户

    public void deleteUser(String UserID); //通过UserID删除对应用户

    public void updateUserName(String UserID, String UserName);
    public void updateUserPassword(String UserID, String UserPassword);
    public void updateUserDepartment(String UserID, String UserDepartment);

}
