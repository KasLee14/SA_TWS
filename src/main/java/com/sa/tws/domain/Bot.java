package com.sa.tws.domain;

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

    public String getBotID() {
        return BotID;
    }

    public void setBotID(String botID) {
        BotID = botID;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public int getBotStatus() {
        return BotStatus;
    }

    public void setBotStatus(int botStatus) {
        BotStatus = botStatus;
    }

    public String getDepositoryID() {
        return DepositoryID;
    }

    public void setDepositoryID(String depositoryID) {
        DepositoryID = depositoryID;
    }

    @Override
    public String toString() {
        return "Bot{" +
                "BotID='" + BotID + '\'' +
                ", Location='" + Location + '\'' +
                ", BotStatus='" + BotStatus + '\'' +
                ", DepositoryID='" + DepositoryID + '\'' +
                '}';
    }

    
    
    
}
