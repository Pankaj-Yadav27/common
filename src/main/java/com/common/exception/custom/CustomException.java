package com.common.exception.custom;

import org.springframework.http.HttpStatus;

public class CustomException extends RuntimeException {
    private HttpStatus httpStatus;

    public CustomException() {
    }

    public CustomException(String message) {
        super(message);
        httpStatus = HttpStatus.BAD_REQUEST;
    }

    public CustomException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}

