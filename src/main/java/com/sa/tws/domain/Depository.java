package com.sa.tws.domain;

public class Depository {

    public String DepositoryID;

    public String DepositoryName;

    public Depository(String depositoryID, String depositoryName) {
        DepositoryID = depositoryID;
        DepositoryName = depositoryName;
    }

    public String getDepositoryID() {
        return DepositoryID;
    }

    public void setDepositoryID(String depositoryID) {
        DepositoryID = depositoryID;
    }

    public String getDepositoryName() {
        return DepositoryName;
    }

    public void setDepositoryName(String depositoryName) {
        DepositoryName = depositoryName;
    }

    @Override
    public String toString() {
        return "Depository{" +
                "DepositoryID='" + DepositoryID + '\'' +
                ", DepositoryName='" + DepositoryName + '\'' +
                '}';
    }
}
