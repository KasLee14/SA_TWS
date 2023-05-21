package com.sa.tws.domain;

public class Tool {

    public String ToolID;
    public String ToolName;
    public String ToolType;
    public String ToolLocation;
    public String ShelfID;

    public int ToolNum;

    public Tool(String toolID, String toolName, String toolType, String toolLocation, String shelfID, int toolNum) {
        ToolID = toolID;
        ToolName = toolName;
        ToolType = toolType;
        ToolLocation = toolLocation;
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

    public String getToolLocation() {
        return ToolLocation;
    }

    public void setToolLocation(String toolLocation) {
        ToolLocation = toolLocation;
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
                ", ToolLocation='" + ToolLocation + '\'' +
                ", ShelfID='" + ShelfID + '\'' +
                ", ToolNum=" + ToolNum +
                '}';
    }
}
