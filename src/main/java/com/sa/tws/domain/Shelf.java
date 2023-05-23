package com.sa.tws.domain;

public class Shelf {

    public String ShelfID;

    public String DepositoryID;
    public String Location;

    public String getShelfID() {
        return ShelfID;
    }

    public void setShelfID(String shelfID) {
        ShelfID = shelfID;
    }

    public String getDepositoryID() {
        return DepositoryID;
    }

    public void setDepositoryID(String depositoryID) {
        DepositoryID = depositoryID;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public Shelf(String shelfID, String depositoryID, String location) {
        ShelfID = shelfID;
        DepositoryID = depositoryID;
        Location = location;
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "ShelfID='" + ShelfID + '\'' +
                ", DepositoryID='" + DepositoryID + '\'' +
                ", Location='" + Location + '\'' +
                '}';
    }
}
