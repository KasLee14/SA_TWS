package com.sa.tws.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class User {

    public User(String userID, String userName, String userPassword, String userType, String userDepartment) {
        UserID = userID;
        UserName = userName;
        UserPassword = userPassword;
        UserType = userType;
        UserDepartment = userDepartment;
    }

    public User() {
    }

    public String UserID;
    public String UserName;

    public String UserPassword;
    public String UserType;
    public String UserDepartment;

}

