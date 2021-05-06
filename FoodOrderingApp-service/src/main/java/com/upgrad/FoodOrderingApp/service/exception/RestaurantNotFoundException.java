package com.upgrad.FoodOrderingApp.service.exception;

import com.upgrad.FoodOrderingApp.service.common.RestaurantNotFoundErrorCode;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * RestaurantNotFoundException is thrown when restaurant asked by customer does not exist in the database.
 */
public class RestaurantNotFoundException extends Exception {
    private final String code;
    private final String errorMessage;

    public RestaurantNotFoundException(final RestaurantNotFoundErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.errorMessage = errorCode.getDefaultMessage();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

    @Override
    public void printStackTrace(PrintStream s) {
        super.printStackTrace(s);
    }

    @Override
    public void printStackTrace(PrintWriter s) {
        super.printStackTrace(s);
    }

    public String getCode() {
        return code;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}

