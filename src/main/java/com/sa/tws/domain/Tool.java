package com.sa.tws.domain;

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

    public String getToolID() {
        return ToolID;
    }

    public void setToolID(String toolID) {
        ToolID = toolID;
    }

    public String getToolName() {
        return ToolName;
    }

    public void setToolName(String toolName) {
        ToolName = toolName;
    }

    public String getToolType() {
        return ToolType;
    }

    public void setToolType(String toolType) {
        ToolType = toolType;
    }

    public String getDepositoryID() {
        return DepositoryID;
    }

    public void setDepositoryID(String depositoryID) {
        DepositoryID = depositoryID;
    }

    public String getShelfID() {
        return ShelfID;
    }

    public void setShelfID(String shelfID) {
        ShelfID = shelfID;
    }

    public int getToolNum() {
        return ToolNum;
    }

    public void setToolNum(int toolNum) {
        ToolNum = toolNum;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "ToolID='" + ToolID + '\'' +
                ", ToolName='" + ToolName + '\'' +
                ", ToolType='" + ToolType + '\'' +
                ", DepositoryID='" + DepositoryID + '\'' +
                ", ShelfID='" + ShelfID + '\'' +
                ", ToolNum=" + ToolNum +
                '}';
    }
}
