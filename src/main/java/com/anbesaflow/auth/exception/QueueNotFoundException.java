package com.anbesaflow.auth.exception;

public class QueueNotFoundException extends RuntimeException {

    public QueueNotFoundException(String message) {
        super(message);
    }
}