package com.nsv.jsmbaba.exceptions;

public class StepFailedRuntimeException extends RuntimeException {
    public StepFailedRuntimeException() {
        super();
    }

    public StepFailedRuntimeException(String message) {
        super(message);
    }
}
