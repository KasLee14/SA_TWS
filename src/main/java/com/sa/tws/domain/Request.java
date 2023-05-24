package com.sa.tws.domain;


public class Request {

    public String RequestID;
    public String UserID;
    public String RequestType;
    public String ToolID;
    public int RequestTargetNum;
    public int RequestResult;

    public Request(String requestID, String userID, String requestType, String toolID, int requestTargetNum, int requestResult) {
        RequestID = requestID;
        UserID = userID;
        RequestType = requestType;
        ToolID = toolID;
        RequestTargetNum = requestTargetNum;
        RequestResult = requestResult;
    }

    public String getRequestID() {
        return RequestID;
    }

    public void setRequestID(String requestID) {
        RequestID = requestID;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getRequestType() {
        return RequestType;
    }

    public void setRequestType(String requestType) {
        RequestType = requestType;
    }

    public String getToolID() {
        return ToolID;
    }

    public void setToolID(String toolID) {
        ToolID = toolID;
    }

    public int getRequestTargetNum() {
        return RequestTargetNum;
    }

    public void setRequestTargetNum(int requestTargetNum) {
        RequestTargetNum = requestTargetNum;
    }

    public int getRequestResult() {
        return RequestResult;
    }

    public void setRequestResult(int requestResult) {
        RequestResult = requestResult;
    }

    public Request() {
    }

    @Override
    public String toString() {
        return "Request{" +
                "RequestID='" + RequestID + '\'' +
                ", UserID='" + UserID + '\'' +
                ", RequestType='" + RequestType + '\'' +
                ", ToolID='" + ToolID + '\'' +
                ", RequestTargetNum=" + RequestTargetNum +
                ", RequestResult=" + RequestResult +
                '}';
    }
}
