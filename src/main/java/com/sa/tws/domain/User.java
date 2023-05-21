package com.sa.tws.domain;

public class User {

    public String UserID;
    public String UserName;
    public String UserPassword;
    public String UserType;
    public String UserDepartment;

    public User(String userID, String userName, String userPassword, String userType, String userDepartment) {
        UserID = userID;
        UserName = userName;
        UserPassword = userPassword;
        UserType = userType;
        UserDepartment = userDepartment;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String userType) {
        UserType = userType;
    }

    public String getUserDepartment() {
        return UserDepartment;
    }

    public void setUserDepartment(String userDepartment) {
        UserDepartment = userDepartment;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserID='" + UserID + '\'' +
                ", UserName='" + UserName + '\'' +
                ", UserPassword='" + UserPassword + '\'' +
                ", UserType='" + UserType + '\'' +
                ", UserDepartment='" + UserDepartment + '\'' +
                '}';
    }
}
