package com.company.exceptions;

public class TaskNotFoundException extends RuntimeException {      //unchecked exception

    private static final String MESSAGE = "Such task doesn't exist.";

    public TaskNotFoundException() {
        super();
    }

    @Override
    public String getMessage() {
        return MESSAGE;
    }
}
