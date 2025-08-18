package com.common.exception;

import com.common.exception.custom.Error;

public class ErrorResponse {
    private final Error error;

    public ErrorResponse(Error error) {
        this.error = error;
    }

    public static class Builder{
        private int status;
        private String message;
        private String type;
        public Builder() {
        }

        public Builder setStatus(int status) {
            this.status = status;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
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

        public ErrorResponse build() {
            return new ErrorResponse(new Error(this));
        }
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "error=" + error +
                '}';
    }
}
