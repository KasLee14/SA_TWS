package com.sa.tws.domain;

public class Depository {

    public String DepositoryID;

    public Depository(String depositoryID) {
        DepositoryID = depositoryID;
    }

    public String getDepositoryID() {
        return DepositoryID;
    }

    public void setDepositoryID(String depositoryID) {
        DepositoryID = depositoryID;
    }

    @Override
    public String toString() {
        return "Depository{" +
                "DepositoryID='" + DepositoryID + '\'' +
                '}';
    }
}
