package com.sa.tws.domain;


public class Request {

    public String RequestID;
    public String RequestUserID;
    public String RequestType;
    public String RequestTargetToolID;
    public int RequestTargetNum;
    public int RequestResult;

    public Request(String requestID, String requestUserID, String requestType, String requestTargetToolID, int requestTargetNum, int requestResult) {
        RequestID = requestID;
        RequestUserID = requestUserID;
        RequestType = requestType;
        RequestTargetToolID = requestTargetToolID;
        RequestTargetNum = requestTargetNum;
        RequestResult = requestResult;
    }

    public String getRequestID() {
        return RequestID;
    }

    public void setRequestID(String requestID) {
        RequestID = requestID;
    }

    public String getRequestUserID() {
        return RequestUserID;
    }

    public void setRequestUserID(String requestUserID) {
        RequestUserID = requestUserID;
    }

    public String getRequestType() {
        return RequestType;
    }

    public void setRequestType(String requestType) {
        RequestType = requestType;
    }

    public String getRequestTargetToolID() {
        return RequestTargetToolID;
    }

    public void setRequestTargetToolID(String requestTargetToolID) {
        RequestTargetToolID = requestTargetToolID;
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

    @Override
    public String toString() {
        return "Request{" +
                "RequestID='" + RequestID + '\'' +
                ", RequestUserID='" + RequestUserID + '\'' +
                ", RequestType='" + RequestType + '\'' +
                ", RequestTargetToolID='" + RequestTargetToolID + '\'' +
                ", RequestTargetNum=" + RequestTargetNum +
                ", RequestResult=" + RequestResult +
                '}';
    }
}
