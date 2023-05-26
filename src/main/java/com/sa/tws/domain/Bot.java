package com.sa.tws.domain;

import lombok.Data;

@Data
public class Bot {
    public String BotID;
    public String Location;
    public int BotStatus;
    public String DepositoryID;

    public Bot(String botID, String location, int botStatus, String depositoryID) {
        BotID = botID;
        Location = location;
        BotStatus = botStatus;
        DepositoryID = depositoryID;
    }

    public Bot() {
    }
}
