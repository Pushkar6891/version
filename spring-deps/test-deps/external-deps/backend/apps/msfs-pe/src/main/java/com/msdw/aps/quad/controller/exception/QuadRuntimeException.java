package com.msdw.aps.quad.controller.exception;

public class QuadRuntimeException extends RuntimeException {
    public QuadRuntimeException(String message) {
        super(message);
    }

    public QuadRuntimeException(String message, Exception e) {
        super(message, e);
    }
}
