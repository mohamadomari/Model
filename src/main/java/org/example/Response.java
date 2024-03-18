package org.example;

import java.util.Date;

public class Response {
    public enum responseType
    {
        success,
        failed,
        processing
    }
    Double amount;
    Date time;
    responseType responseType;

    public Response() {
    }

    public Response(Double amount, Date time, Response.responseType responseType) {
        this.amount = amount;
        this.time = time;
        this.responseType = responseType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Response.responseType getResponseType() {
        return responseType;
    }

    public void setResponseType(Response.responseType responseType) {
        this.responseType = responseType;
    }
}
