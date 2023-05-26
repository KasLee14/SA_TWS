package com.sa.tws.domain;

import lombok.Data;

@Data
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

    public Request() {
    }
}
