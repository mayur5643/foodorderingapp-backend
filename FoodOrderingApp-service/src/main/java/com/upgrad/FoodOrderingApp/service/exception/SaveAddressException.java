package com.upgrad.FoodOrderingApp.service.exception;


import com.upgrad.FoodOrderingApp.service.common.SaveAddressErrorCode;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * SaveAddressException is thrown when a customer not able to save an order.
 */
public class SaveAddressException extends Exception {
    private final String code;
    private final String errorMessage;

    public SaveAddressException(final SaveAddressErrorCode errorCode) {
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

