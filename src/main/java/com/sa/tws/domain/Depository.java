package com.sa.tws.domain;

import lombok.Data;

@Data
public class Depository {

    public String DepositoryID;
    public String DepositoryName;

    public Depository(String depositoryID, String depositoryName) {
        DepositoryID = depositoryID;
        DepositoryName = depositoryName;
    }

    public Depository() {
    }
}
