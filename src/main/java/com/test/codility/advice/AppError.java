package com.test.codility.advice;

import org.springframework.http.HttpStatus;

public class AppError {
    private String id;
    private String message;
    private HttpStatus statusCode;

    public AppError() {
    }

    public AppError(String id, String message, HttpStatus statusCode) {
        this.id = id;
        this.message = message;
        this.statusCode = statusCode;
    }

}
