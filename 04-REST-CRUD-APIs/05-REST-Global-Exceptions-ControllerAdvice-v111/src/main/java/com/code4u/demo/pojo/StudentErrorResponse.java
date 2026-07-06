package com.code4u.demo.pojo;

public class StudentErrorResponse {
    private int statusCode;
    private String msg;
    private long timeStamp;

    public StudentErrorResponse()
    {

    }
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getMsg() {
        return msg;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public StudentErrorResponse(int statusCode, String msg, long timeStamp) {
        this.statusCode = statusCode;
        this.msg = msg;
        this.timeStamp = timeStamp;
    }
}
