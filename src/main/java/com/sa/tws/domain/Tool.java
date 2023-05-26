package com.sa.tws.domain;

import lombok.Data;

@Data
public class Tool {

    public String ToolID;
    public String ToolName;
    public String ToolType;
    public String DepositoryID;
    public String ShelfID;
    public int ToolNum;

    public Tool(String toolID, String toolName, String toolType, String depositoryID, String shelfID, int toolNum) {
        ToolID = toolID;
        ToolName = toolName;
        ToolType = toolType;
        DepositoryID = depositoryID;
        ShelfID = shelfID;
        ToolNum = toolNum;
    }

    public Tool() {
    }
}
