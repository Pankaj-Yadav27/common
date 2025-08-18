package com.common.exception;

import com.common.exception.custom.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(value = CustomException.class)
    public ResponseEntity<ErrorResponse> handleCustomException(CustomException exception) {
        return new ResponseEntity<>(getExceptionResponse(exception.getHttpStatus(), exception.getMessage()), HttpStatusCode.valueOf(exception.getHttpStatus().value()));
    }

    public ErrorResponse getExceptionResponse(HttpStatus status,String message){
        return new ErrorResponse.Builder()
                .setStatus(status.value())
                .setType(status.name())
                .setMessage(message)
                .build();
    }
}
