package com.sa.tws.domain;

import lombok.Data;

@Data
public class Shelf {

    public String ShelfID;
    public String DepositoryID;
    public String Location;

    public Shelf(String shelfID, String depositoryID, String location) {
        ShelfID = shelfID;
        DepositoryID = depositoryID;
        Location = location;
    }

    public Shelf() {
    }
}
