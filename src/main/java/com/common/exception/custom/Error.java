package com.common.exception.custom;

import com.common.exception.ErrorResponse;

import java.time.LocalDateTime;

public class Error{
    private final int status;
    private final String message;
    private final String type;
    private final LocalDateTime timeStamp=LocalDateTime.now();

    public Error(ErrorResponse.Builder builder) {
        this.status=builder.getStatus();
        this.message=builder.getMessage();
        this.type=builder.getType();
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    @Override
    public String toString() {
        return "Error{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", type='" + type + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
